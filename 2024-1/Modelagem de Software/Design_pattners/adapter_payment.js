// Adaptee (Implementação específica do meio de pagamento)
class CreditCardPayment {
    makePayment(amount) {
      console.log(`Paid ${amount} via Credit Card.`);
    }
  }
  
  // Adaptee (Outra implementação específica)
  class PayPalPayment {
    sendPayment(amount) {
      console.log(`Sent ${amount} via PayPal.`);
    }
  }
  
  // Target interface (Interface esperada pelo cliente)
  class PaymentAdapter {
    constructor(payment) {
      this.payment = payment;
    }
  
    pay(amount) {
      if (this.payment.makePayment) {
        this.payment.makePayment(amount);
      } else if (this.payment.sendPayment) {
        this.payment.sendPayment(amount);
      } else {
        throw new Error('Unsupported payment method.');
      }
    }
  }
  
  // Uso do Adapter
  const creditCardPayment = new CreditCardPayment();
  const paypalPayment = new PayPalPayment();
  
  const paymentAdapter1 = new PaymentAdapter(creditCardPayment);
  paymentAdapter1.pay(100); // Saída: Paid 100 via Credit Card.
  
  const paymentAdapter2 = new PaymentAdapter(paypalPayment);
  paymentAdapter2.pay(50); // Saída: Sent 50 via PayPal.