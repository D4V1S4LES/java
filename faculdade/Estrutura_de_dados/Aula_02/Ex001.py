#Algoritmo para cálculo de média;

nota1 = float(input('Digite a nota do primeiro bimestre:'))
nota2 = float(input('Digite a nota do segundo bimestre:'))

media = (nota1 + nota2) / 2

if media >= 7:
    print('Aluno aprovado! Sua média foi {}'.format(media))

if media < 7:
    print('Aluno reprovado! Sua média foi {}'.format(media))

print('Fim do terminal')