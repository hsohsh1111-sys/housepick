package com.onrender.housepick.service;

import com.onrender.housepick.dto.QnaDto;
import com.onrender.housepick.repository.QnaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QnaService{

    private final QnaRepository qnaRepository;

    public QnaService(QnaRepository qnaRepository){
        this.qnaRepository = qnaRepository;
    }

    public List<QnaDto> getAllQnaList(){
        return qnaRepository.findAll();
    }

    public void createQna(QnaDto qna){
        qnaRepository.save(qna);
    }
}