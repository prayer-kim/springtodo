package kr.re.kitri.hellogram.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LoggingAspect {

    // 패키지 하위 모든 컨트롤러 메소드 시작 시(파라미터 상관 없음) 로그 생성(포인트 컷 문법 사용)
    @Before("execution(* kr.re.kitri.hellogram.*.controller.*Controller.*(..))")
    public void logging(JoinPoint joinPoint) {
        String className = joinPoint.getSignature().getDeclaringTypeName();
        String methodName = joinPoint.getSignature().getName();

        log.debug(className + "." + methodName + "() Logging Aspect에서 시작");

    }

    // 함수 소요시간을 사용할 때 이용 가능 함
    @Around("execution(* kr.re.kitri.hellogram.*.controller.*Controller.*(..))")
    public Object logging(ProceedingJoinPoint pjp) throws Throwable {
        log.info("### start - " + pjp.getSignature().getDeclaringTypeName()
                + " / " + pjp.getSignature().getName());
        Object result = pjp.proceed();
        log.info("### finished - " + pjp.getSignature().getDeclaringTypeName()
                + " / " + pjp.getSignature().getName());
        return result;
    }
}
