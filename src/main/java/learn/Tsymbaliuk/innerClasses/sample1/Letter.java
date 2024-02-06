package learn.Tsymbaliuk.innerClasses.sample1;

public class Letter {
    private String sender;

    public Letter(String sender) {
        this.sender = sender;
    }

    @Override
    public String toString() {
        return "Letter{" +
                "sender='" + sender + '\'' +
                '}';
    }

    public class Address {
        private int postCode;

        public String getLetterSender() {
            return sender;
        }

        public Address(int postCode) {
            this.postCode = postCode;
        }

        @Override
        public String toString() {
            return "Address { postCode = " + postCode + "}" + Letter.this.sender;
        }
    }
}
