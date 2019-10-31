import zeep

wsdl = 'http://127.0.0.1:9000/calcsoap?wsdl'
client = zeep.Client(wsdl=wsdl)

print("Soma: ")
print(client.service.soma(5, 2))
print(client.service.soma(2, 2))
print(client.service.soma(40, 15))

print("Subtracao: ")
print(client.service.subtracao(5, 2))
print(client.service.subtracao(2, 2))
print(client.service.subtracao(40, 15))



