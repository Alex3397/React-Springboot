package com.AmigosCodeJava.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonConfig {
    @Bean
    public AmazonS3 s3() {
        AWSCredentials awsCredentials = new BasicAWSCredentials("AKIAIRPZ6KHETGNNZ2ZA","q8ZS5+rW0u9jAHvF3CjH1jp2jun7W4Voph/7L5kN");
        return AmazonS3ClientBuilder.standard().withRegion("sa-east-1").withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();
    }
}
