import statistics

''' DataSciencePrg01 Sample program to calculate mean median mode 
standard deviation and variance '''

class DataSciencePrg01:
    # Initialize method to initialize all the variable
    def __init__(self):
        self.example_list = [5, 2, 5, 6, 1, 2, 6, 7, 2, 6, 3, 5, 5]
        self.x = 0
        self.y = 0
        self.z = 0
        self.a = 0
        self.b = 0

    # Method or function used to calculate Statistical Mean
    def mean(self):
        self.x = statistics.mean(self.example_list)
        print(self.x)

    # Method or function  used to calculate Statistical median
    def median(self):
        self.y = statistics.median(self.example_list)
        print(self.y)

    # Method or function  used to calculate Statistical mode
    def mode(self):
        self.z = statistics.mode(self.example_list)
        print(self.z)

    # Method or function  used to calculate Statistical stdev
    def stdev(self):
        self.a = statistics.stdev(self.example_list)
        print(self.a)

    # Method or function  used to calculate Statistical variance
    def variance(self):
        self.b = statistics.variance(self.example_list)
        print(self.b)

# Main method to run all methods for testing
if __name__ == '__main__':
    dataScience = DataSciencePrg01()
    dataScience.mean()
    dataScience.median()
    dataScience.mode()
    dataScience.stdev()
    dataScience.variance()