package com.myblog.myblog11;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import static com.fasterxml.jackson.databind.cfg.CoercionInputShape.Array;
//import static com.sun.beans.introspect.PropertyInfo.Name.bound;
//import static com.sun.beans.introspect.PropertyInfo.Name.bound;

public class Test {
    public static void main(String[] args)
    {

        List<Login> logins = Arrays.asList(
                new Login("Ashok", "testing"),
                new Login("Iresh", "testing"),
                new Login("Ankur", "testing")
        );
        System.out.println(logins);








//        List<String> data = Arrays.asList("ashok","arfin","kamala");
//        List<String> newdata = data.stream().sorted().collect(Collectors.toList());
//        Function<String,Integer> result = str->str.length();
//        Integer val = result.apply("ashok");
//        System.out.println(newdata);


//        Consumer example
//        Consumer<Integer>  result = number-> System.out.println(number);
//        result.accept(100);
//
//        List<String> names = Arrays.asList("Ashok","Arfin", "kamala");
//        Consumer<String> val = System.out::println;
//        names.forEach(val);
        //        List<Integer> evennum = number.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        //Supplier only give output without any input.
//        Supplier<Integer> x = () -> new Random().nextInt(500);
//        Integer y = x.get();
//        System.out.println(y);


//        List<Integer> number = Arrays.asList(10,12,6,4,2,7,5);
//        List<Integer> data1 = number.stream().filter(n1->n1%2==0).map(n2->n2*n2).collect(Collectors.toList());
//        System.out.println(data1);

          //group

       List<LoginDto> dtos = logins.stream().map(login -> mapToDto(login)).collect(Collectors.toList());
       System.out.println(dtos);



    }
    static LoginDto mapToDto(Login login){
        LoginDto dto = new LoginDto();
        dto.setUserName(login.getUserName());
        dto.setPassword(login.getPassword());
        return dto;
    }

}
