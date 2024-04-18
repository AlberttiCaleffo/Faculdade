def inserir_valor():
    while True:
        try:
            valor = float(input('Valor: '))
            return valor
        except:
            print('Dado incorreto. Insira novamente.')

def inserir_produto():
    produto = input('Nome do produto: ').strip()
    return produto