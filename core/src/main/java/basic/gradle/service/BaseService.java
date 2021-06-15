package basic.gradle.service;

import org.springframework.stereotype.Service;

@Service
public class BaseService implements IBaseService {

    @Override
    public String getMessage() {
        return "Message from core module";
    }
}
