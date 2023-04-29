import datetime
n=input("Enter your name : ")
a=int(input("Enter your age : "))
today=datetime.datetime.now()
year=(100-a)+today.year
def fun():
    print("Dear "+n+" , you will be 100 years old in",year)
fun()