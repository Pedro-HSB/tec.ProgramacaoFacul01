        public static void main(String[] args) {
            ContaC conta1 = new ContaC("nome", "masculino",20,100,true,1000);
            conta1.info();
            conta1.saque(100);
            conta1.info();
            conta1.deposito(100);
            conta1.info();
    }