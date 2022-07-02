package in.neuron.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.neuron.demo.bean.Question;
import in.neuron.demo.dao.IQuestionDao;

@Service
@Transactional
public class QuestionService {

	@Autowired
	private IQuestionDao repo;

	public List<Question> showAll() {
		return repo.findAll();
	}

}
