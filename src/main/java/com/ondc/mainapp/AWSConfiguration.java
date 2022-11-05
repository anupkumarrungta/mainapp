package com.ondc.mainapp;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.EnvironmentVariableCredentialsProvider;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;

@Configuration
public class AWSConfiguration {

    @Value("${spring.aws.accessId}")
    private String awsAccessKeyId;

    @Value("${spring.aws.secretId}")
    private String awsSecretKey;

    @Value("${spring.aws.region}")
    private String awsRegion;

    private AwsBasicCredentials awsBasicCredentials() {
        System.out.println("### aws region "+ awsRegion + " access key" + awsAccessKeyId + "  secret key: " + awsSecretKey);
        return AwsBasicCredentials.create(awsAccessKeyId, awsSecretKey);
    }

    @Bean
    public StaticCredentialsProvider staticCredentialsProvider() {
        System.out.println("#### aws region "+ awsRegion + " access key" + awsAccessKeyId + "  secret key: " + awsSecretKey);
        return StaticCredentialsProvider.create(awsBasicCredentials());
    }
/*
    @Bean
    public S3Client s3Client() {
        return S3Client.builder().region(Region.of(awsRegion))
                .credentialsProvider(staticCredentialsProvider())
                .build();
    }

    @Bean
    public ProfileCredentialsProvider profileCredentialsProvider() {
        return ProfileCredentialsProvider.create("s3_cred");
    }
*/
    @Bean
    public EnvironmentVariableCredentialsProvider environmentVariableCredentialsProvider() {
        // will create using default aws access key id and secret
        return EnvironmentVariableCredentialsProvider.create();
    }
}