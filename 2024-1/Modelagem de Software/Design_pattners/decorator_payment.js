// Component interface (Interface base)
class Payment {
    constructor(amount) {
      this.amount = amount;
    }
  
    pay() {
      return this.amount;
    }
  }
  
  // Concrete component (Componente concreto)
  class CreditCardPayment extends Payment {
    pay() {
      const amount = super.pay();
      console.log(`Paid ${amount} via Credit Card.`);
      return amount;
    }
  }
  
  // Decorator (Decorador)
  class TaxDecorator {
    constructor(payment) {
      this.payment = payment;
    }
  
    pay() {
      const amount = this.payment.pay();
      const taxedAmount = amount * 1.1; // Aplicando um imposto de 10%
      console.log(`Paid ${taxedAmount} (including tax)`);
      return taxedAmount;
    }
  }
  
  // Decorator (Outro decorador)
  class DiscountDecorator {
    constructor(payment) {
      this.payment = payment;
    }
  
    pay() {
      const amount = this.payment.pay();
      const discountedAmount = amount * 0.9; // Aplicando um desconto de 10%
      console.log(`Paid ${discountedAmount} (after discount)`);
      return discountedAmount;
    }
  }
  
  // Uso do Decorator
  let payment = new CreditCardPayment(100);
  
  // Adicionando imposto ao pagamento
  payment = new TaxDecorator(payment);
  payment.pay(); // Saída: Paid 110 (including tax)
  
  // Adicionando desconto ao pagamento
  payment = new DiscountDecorator(payment);
  payment.pay(); // Saída: Paid 99 (after discount)