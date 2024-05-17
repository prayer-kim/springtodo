package kr.re.kitri.hellogram.order.service;

import kr.re.kitri.hellogram.order.model.Order;
import kr.re.kitri.hellogram.order.repository.CustomerRepository;
import kr.re.kitri.hellogram.order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Transactional
    public void doOrder(Order order){
        // FIXME order 데이터 생성
        orderRepository.insertOrder(order);

        // FIXME 고객 포인트 증가
        customerRepository.insertPoint();

    }
}
