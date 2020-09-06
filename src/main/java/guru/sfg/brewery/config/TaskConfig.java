package guru.sfg.brewery.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 06.09.2020
 * created TaskConfig in guru.sfg.brewery.config
 * in project scc-brewery
 */
@EnableScheduling
@EnableAsync
@Configuration
public class TaskConfig {
    @Bean
    TaskExecutor taskExecutor() {
        return new SimpleAsyncTaskExecutor();
    }
}
