n=int(input("Enter size of dictionary"))
dic={}
for i in range(n):
    word=input("Enter the word:")
    dic[word]=len(word)
print(dic)
