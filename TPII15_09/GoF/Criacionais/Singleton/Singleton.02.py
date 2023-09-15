class Carrinho:
    _instance = None

    def __new__(cls):
        if cls._instance is None:
            cls._instance = super(Carrinho, cls).__new__(cls)
            cls._instance.produtos = []
        return cls._instance

    def add_produto(self, produto):
        self.produtos.append(produto)

    def get_produtos(self):
        return self.produtos

    def clear_carrinho(self):
        self.produtos = []

# Classe Produto
class Produto:
    def __init__(self, id, nome, preco):
        self.id = id
        self.nome = nome
        self.preco = preco

    def __str__(self):
        return f"ID: {self.id}, Nome: {self.nome}, Preço: {self.preco}"

# EXEMPLO DE USO ##############################################################
carrinho_instance1 = Carrinho()
carrinho_instance2 = Carrinho()

print(carrinho_instance1 is carrinho_instance2)

produto1 = Produto(1, "Produto 1", 10.00)
produto2 = Produto(2, "Produto 2", 20.00)

carrinho_instance1.add_produto(produto1)
carrinho_instance2.add_produto(produto2)

print(carrinho_instance1.get_produtos())
print(carrinho_instance2.get_produtos())

carrinho_instance1.clear_carrinho()

print(carrinho_instance1.get_produtos())
print(carrinho_instance2.get_produtos())
