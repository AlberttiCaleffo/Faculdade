from time import sleep

lista_de_compras = {}

contador = 1
total = codigo = 0
quants = []

print('Bem-Vindo a padaria [nome]')
sleep(1)

while True:
    produto = input('Nome do produto: ').strip()
    while True:
        try:
            valor = float(input('Valor: '))
            quantidade = int(input('Quantidade: '))
            quants.append(quantidade)
            valor_vezes_quantidade = valor * quants[codigo]
            codigo += 1
            break
        except:
            print('Dado incorreto. Insira novamente.')
    lista_de_compras[produto] = valor
    print('Adicionando...')
    sleep(1)
    print('Adicionado')
    print('-+' * 10)
    total += valor_vezes_quantidade
    for produto, valor in lista_de_compras.items():
        print(f'- {produto:<16}{codigo}\n  {valor * quants[contador - 1]:.2f}\n')
        contador += 1
    print(f'TOTAL: {total:.2f}')
    print('-+' * 10)
    contador = 1
    continuar = input('Continuar? [S/N]: ').strip().lower()
    if continuar[0] == 'n':
        codigo = 0
        break 
    
for produto, valor in lista_de_compras.items():
    print(f'- {produto:<16}{codigo}\n  {valor:.2f}\n')
    codigo += 1
print(f'TOTAL: {total:.2f}')