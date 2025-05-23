package com.openai.example;

import com.openai.client.OpenAIClientAsync;
import com.openai.client.okhttp.OpenAIOkHttpClientAsync;
import com.openai.models.moderations.ModerationCreateParams;
import com.openai.models.moderations.ModerationModel;

public final class ModerationsAsyncExample {
    private ModerationsAsyncExample() {}

    public static void main(String[] args) {
        // Configures using one of:
        // - The `OPENAI_API_KEY` environment variable
        // - The `OPENAI_BASE_URL` and `AZURE_OPENAI_KEY` environment variables
        OpenAIClientAsync client = OpenAIOkHttpClientAsync.fromEnv();

        ModerationCreateParams createParams = ModerationCreateParams.builder()
                .input("I want to kill them.")
                .model(ModerationModel.OMNI_MODERATION_LATEST)
                .build();

        client.moderations()
                .create(createParams)
                .thenAccept(System.out::println)
                .join();
    }
}
