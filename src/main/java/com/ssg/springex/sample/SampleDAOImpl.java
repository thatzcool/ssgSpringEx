package com.ssg.springex.sample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;


@Repository
@Qualifier("basic")
public class SampleDAOImpl implements SampleDAO{   //SampleDAOImpl 에는 @Repository 를 이용해서 해당 클래스의 객체를 스프링의 Bean 으로 처리되도록 한다.
}


