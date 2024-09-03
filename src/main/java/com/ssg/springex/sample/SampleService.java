package com.ssg.springex.sample;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@ToString
@RequiredArgsConstructor      //생성자 주입 방식 수정
public class SampleService {

  @Qualifier("event")
  private final SampleDAO sampleDAO;



}
