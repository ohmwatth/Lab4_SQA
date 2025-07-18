package TestNormalBoundaryValue;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import sqa.main.Ranking;

class TestNormalBoundaryValue {
	
	Ranking ranking = new Ranking();

	
	@Test
	@DisplayName("TC01 Expected result = silver,purchaseTotal = 10000(min),frequency = 4(nom) ,pointCollected = 500(nom)")
	void test_01() {
		String result = ranking.CalculateMembershipRank(10000, 4, 500);
		assertEquals("Silver", result);
	}
	
	@Test
	@DisplayName("TC02 Expected result = silver,purchaseTotal = 10001(min+),frequency = 4(nom) ,pointCollected = 500(nom)")
	void test_02() {
		String result = ranking.CalculateMembershipRank(10001, 4,500);
		assertEquals("Silver", result);
	}
	
	@Test
	@DisplayName("TC03 Expected result = Gold,purchaseTotal = 50000(nom),frequency = 4(nom) ,pointCollected = 500(nom)")
	void test_03() {
		String result = ranking.CalculateMembershipRank(50000, 4,500);
		assertEquals("Gold", result);
	}
	
	@Test
	@DisplayName("TC04 Expected result = Gold,purchaseTotal = 99999(max-),frequency = 4(nom) ,pointCollected = 500(nom)")
	void test_04() {
		String result = ranking.CalculateMembershipRank(99999, 4,500);
		assertEquals("Gold", result);
	}
	
	@Test
	@DisplayName("TC05 Expected result = Gold,purchaseTotal = 10000(max),frequency = 4(nom) ,pointCollected = 500(nom)")
	void test_05() {
		String result = ranking.CalculateMembershipRank(10000, 4,500);
		assertEquals("Gold", result);
	}
	
	@Test
	@DisplayName("TC06 Expected result = silver,purchaseTotal = 50000(nom),frequency = 1(min) ,pointCollected = 500(nom)")
	void test_06() {
		String result = ranking.CalculateMembershipRank(50000, 1,500);
		assertEquals("Silver", result);
	}
	
	@Test
	@DisplayName("TC07 Expected result = silver,purchaseTotal = 50000(nom),frequency = 2(min+) ,pointCollected = 500(nom)")
	void test_07() {
		String result = ranking.CalculateMembershipRank(50000, 2,500);
		assertEquals("Silver", result);
	}
	
	@Test
	@DisplayName("TC08 Expected result = Gold,purchaseTotal = 50000(nom),frequency = 6(max-) ,pointCollected = 500(nom)")
	void test_08() {
		String result = ranking.CalculateMembershipRank(50000, 6,500);
		assertEquals("Gold", result);
	}
	
	@Test
	@DisplayName("TC09 Expected result = Gold,purchaseTotal = 50000(nom),frequency = 7(max) ,pointCollected = 500(nom)")
	void test_09() {
		String result = ranking.CalculateMembershipRank(50000, 7,500);
		assertEquals("Gold", result);
	}
	
	@Test
	@DisplayName("TC10 Expected result = Silver,purchaseTotal = 50000(nom),frequency = 4(nom) ,pointCollected = 100(min)")
	void test_10() {
		String result = ranking.CalculateMembershipRank(50000, 4,100);
		assertEquals("Silver", result);
	}
	
	@Test
	@DisplayName("TC11 Expected result = Silver,purchaseTotal = 50000(nom),frequency = 4(nom) ,pointCollected = 101(min+)")
	void test_11() {
		String result = ranking.CalculateMembershipRank(50000, 4,101);
		assertEquals("Silver", result);
	}
	
	@Test
	@DisplayName("TC12 Expected result = Gold,purchaseTotal = 50000(nom),frequency = 4(nom) ,pointCollected = 999(max-)")
	void test_12() {
		String result = ranking.CalculateMembershipRank(50000, 4,999);
		assertEquals("Gold", result);
	}
	
	@Test
	@DisplayName("TC13 Expected result = Gold,purchaseTotal = 50000(nom),frequency = 4(nom) ,pointCollected = 1000(max)")
	void test_13() {
		String result = ranking.CalculateMembershipRank(50000, 4,1000);
		assertEquals("Gold", result);
	}

}
