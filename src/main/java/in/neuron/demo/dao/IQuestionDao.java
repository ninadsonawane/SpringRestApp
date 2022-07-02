package in.neuron.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.neuron.demo.bean.Question;

public interface IQuestionDao extends JpaRepository<Question, Integer> {

}
