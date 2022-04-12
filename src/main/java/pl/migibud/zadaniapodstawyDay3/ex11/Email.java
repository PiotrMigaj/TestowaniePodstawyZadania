package pl.migibud.zadaniapodstawyDay3.ex11;

public class Email {

    private String receiver;
    private String title;
    private String bodyMsg;
    private String attachment;

    @Override
    public String toString() {
        return "Email{" +
                "receiver='" + receiver + '\'' +
                ", title='" + title + '\'' +
                ", bodyMsg='" + bodyMsg + '\'' +
                ", attachment='" + attachment + '\'' +
                '}';
    }

    public String getReceiver() {
        return receiver;
    }

    private Email(){}

    static class Builder{

        private Email email;

        public Builder(){
            email = new Email();
        }

        Builder receiver(String receiver){
            this.email.receiver= receiver;
            return this;
        }

        Builder title(String title){
            this.email.title = title;
            return this;
        }

        Builder bodyMsg(String bodyMsg){
            this.email.bodyMsg=bodyMsg;
            return this;
        }

        Builder attachment(String attachment){
            this.email.attachment=attachment;
            return this;
        }

        Email build(){
            return this.email;
        }
    }

}
