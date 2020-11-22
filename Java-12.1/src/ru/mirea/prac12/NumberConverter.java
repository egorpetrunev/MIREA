package ru.mirea.prac12;

public class NumberConverter {

    private final String number;
    private final Converter converter;

    public String convert(){
        return converter.convert(number);
    }

    public NumberConverter(String number){
        this.number = number;
        if (number.charAt(0) == '+'){
            converter = new NormalConverter();
        } else {
            converter = new RussianConverter();
        }
    }

    private interface Converter{
        String convert(String number);
    }

    private static class NormalConverter implements Converter{
        @Override
        public String convert(String number) {
            StringBuilder sb = new StringBuilder(number);
            sb.insert(sb.length() - 4, '-');
            sb.insert(sb.length() - 8, '-');
            return sb.toString();
        }
    }

    private static class RussianConverter implements Converter{
        @Override
        public String convert(String number) {
            StringBuilder sb = new StringBuilder(number);
            sb.insert(sb.length() - 4, '-');
            sb.insert(sb.length() - 8, '-');
            sb.replace(0,1, "+7");
            return sb.toString();
        }
    }

}
