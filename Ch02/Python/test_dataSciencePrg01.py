from unittest import TestCase
from DataSciencePrg01 import DataSciencePrg01

''' TestDataScience is test program for testing DataSciencePrg01 
We will test the calculation of mean median mode 
standard deviation and variance '''
class TestDataScience(TestCase):
    # Test Method or function setup process
    def setUp(self):
        self.datascience = DataSciencePrg01()

    # Method or function used to test variance before calculation
    def test_mean(self):
        self.assertEqual(0, self.datascience.a)

    # Method or function used to test variance after calculation
    def test_mean1(self):
        self.datascience.mean()
        self.assertEqual(4.230769230769231, self.datascience.x)

    # Method or function used to test median before calculation
    def test_median(self):
        self.assertEqual(0, self.datascience.y)

    # Method or function used to test median after calculation
    def test_median1(self):
        self.datascience.median()
        self.assertEqual(5, self.datascience.y)

    # Method or function used to test mode before calculation
    def test_mode(self):
        self.assertEqual(0, self.datascience.z)

    # Method or function used to test mode after calculation
    def test_mode1(self):
        self.datascience.mode()
        self.assertEqual(5, self.datascience.z)

    # Method or function used to test standard deviation before calculation
    def test_stdev(self):
        self.assertEqual(0, self.datascience.a)

    # Method or function used to test standard deviation after calculation
    def test_stdev1(self):
        self.datascience.stdev()
        self.assertEqual(1.9644272343292228, self.datascience.a)

    # Method or function used to test variance before calculation
    def test_variance(self):
        self.assertEqual(0, self.datascience.a)

    # Method or function used to test variance after calculation
    def test_variance1(self):
        self.datascience.variance()
        self.assertEqual(3.858974358974359, self.datascience.b)

    # Method or function used to test variance after calculation Negative test case
    def test_variance2(self):
        self.datascience.variance()
        self.assertNotEqual(3.332, self.datascience.b)


if __name__ == '__main__':
    unittest.main()
