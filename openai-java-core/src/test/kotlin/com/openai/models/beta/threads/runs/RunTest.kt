// File generated from our OpenAPI spec by Stainless.

package com.openai.models.beta.threads.runs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openai.core.JsonValue
import com.openai.core.jsonMapper
import com.openai.models.beta.assistants.AssistantTool
import com.openai.models.beta.assistants.CodeInterpreterTool
import com.openai.models.beta.threads.AssistantResponseFormatOption
import com.openai.models.beta.threads.AssistantToolChoiceOption
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunTest {

    @Test
    fun create() {
        val run =
            Run.builder()
                .id("id")
                .assistantId("assistant_id")
                .cancelledAt(0L)
                .completedAt(0L)
                .createdAt(0L)
                .expiresAt(0L)
                .failedAt(0L)
                .incompleteDetails(
                    Run.IncompleteDetails.builder()
                        .reason(Run.IncompleteDetails.Reason.MAX_COMPLETION_TOKENS)
                        .build()
                )
                .instructions("instructions")
                .lastError(
                    Run.LastError.builder()
                        .code(Run.LastError.Code.SERVER_ERROR)
                        .message("message")
                        .build()
                )
                .maxCompletionTokens(256L)
                .maxPromptTokens(256L)
                .metadata(
                    Run.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .model("model")
                .parallelToolCalls(true)
                .requiredAction(
                    Run.RequiredAction.builder()
                        .submitToolOutputs(
                            Run.RequiredAction.SubmitToolOutputs.builder()
                                .addToolCall(
                                    RequiredActionFunctionToolCall.builder()
                                        .id("id")
                                        .function(
                                            RequiredActionFunctionToolCall.Function.builder()
                                                .arguments("arguments")
                                                .name("name")
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .responseFormatAuto()
                .startedAt(0L)
                .status(RunStatus.QUEUED)
                .threadId("thread_id")
                .toolChoice(AssistantToolChoiceOption.Auto.NONE)
                .addTool(CodeInterpreterTool.builder().build())
                .truncationStrategy(
                    Run.TruncationStrategy.builder()
                        .type(Run.TruncationStrategy.Type.AUTO)
                        .lastMessages(1L)
                        .build()
                )
                .usage(
                    Run.Usage.builder()
                        .completionTokens(0L)
                        .promptTokens(0L)
                        .totalTokens(0L)
                        .build()
                )
                .temperature(0.0)
                .topP(0.0)
                .build()

        assertThat(run.id()).isEqualTo("id")
        assertThat(run.assistantId()).isEqualTo("assistant_id")
        assertThat(run.cancelledAt()).contains(0L)
        assertThat(run.completedAt()).contains(0L)
        assertThat(run.createdAt()).isEqualTo(0L)
        assertThat(run.expiresAt()).contains(0L)
        assertThat(run.failedAt()).contains(0L)
        assertThat(run.incompleteDetails())
            .contains(
                Run.IncompleteDetails.builder()
                    .reason(Run.IncompleteDetails.Reason.MAX_COMPLETION_TOKENS)
                    .build()
            )
        assertThat(run.instructions()).isEqualTo("instructions")
        assertThat(run.lastError())
            .contains(
                Run.LastError.builder()
                    .code(Run.LastError.Code.SERVER_ERROR)
                    .message("message")
                    .build()
            )
        assertThat(run.maxCompletionTokens()).contains(256L)
        assertThat(run.maxPromptTokens()).contains(256L)
        assertThat(run.metadata())
            .contains(
                Run.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(run.model()).isEqualTo("model")
        assertThat(run.parallelToolCalls()).isEqualTo(true)
        assertThat(run.requiredAction())
            .contains(
                Run.RequiredAction.builder()
                    .submitToolOutputs(
                        Run.RequiredAction.SubmitToolOutputs.builder()
                            .addToolCall(
                                RequiredActionFunctionToolCall.builder()
                                    .id("id")
                                    .function(
                                        RequiredActionFunctionToolCall.Function.builder()
                                            .arguments("arguments")
                                            .name("name")
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(run.responseFormat()).contains(AssistantResponseFormatOption.ofAuto())
        assertThat(run.startedAt()).contains(0L)
        assertThat(run.status()).isEqualTo(RunStatus.QUEUED)
        assertThat(run.threadId()).isEqualTo("thread_id")
        assertThat(run.toolChoice())
            .contains(AssistantToolChoiceOption.ofAuto(AssistantToolChoiceOption.Auto.NONE))
        assertThat(run.tools())
            .containsExactly(AssistantTool.ofCodeInterpreter(CodeInterpreterTool.builder().build()))
        assertThat(run.truncationStrategy())
            .contains(
                Run.TruncationStrategy.builder()
                    .type(Run.TruncationStrategy.Type.AUTO)
                    .lastMessages(1L)
                    .build()
            )
        assertThat(run.usage())
            .contains(
                Run.Usage.builder().completionTokens(0L).promptTokens(0L).totalTokens(0L).build()
            )
        assertThat(run.temperature()).contains(0.0)
        assertThat(run.topP()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val run =
            Run.builder()
                .id("id")
                .assistantId("assistant_id")
                .cancelledAt(0L)
                .completedAt(0L)
                .createdAt(0L)
                .expiresAt(0L)
                .failedAt(0L)
                .incompleteDetails(
                    Run.IncompleteDetails.builder()
                        .reason(Run.IncompleteDetails.Reason.MAX_COMPLETION_TOKENS)
                        .build()
                )
                .instructions("instructions")
                .lastError(
                    Run.LastError.builder()
                        .code(Run.LastError.Code.SERVER_ERROR)
                        .message("message")
                        .build()
                )
                .maxCompletionTokens(256L)
                .maxPromptTokens(256L)
                .metadata(
                    Run.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .model("model")
                .parallelToolCalls(true)
                .requiredAction(
                    Run.RequiredAction.builder()
                        .submitToolOutputs(
                            Run.RequiredAction.SubmitToolOutputs.builder()
                                .addToolCall(
                                    RequiredActionFunctionToolCall.builder()
                                        .id("id")
                                        .function(
                                            RequiredActionFunctionToolCall.Function.builder()
                                                .arguments("arguments")
                                                .name("name")
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .responseFormatAuto()
                .startedAt(0L)
                .status(RunStatus.QUEUED)
                .threadId("thread_id")
                .toolChoice(AssistantToolChoiceOption.Auto.NONE)
                .addTool(CodeInterpreterTool.builder().build())
                .truncationStrategy(
                    Run.TruncationStrategy.builder()
                        .type(Run.TruncationStrategy.Type.AUTO)
                        .lastMessages(1L)
                        .build()
                )
                .usage(
                    Run.Usage.builder()
                        .completionTokens(0L)
                        .promptTokens(0L)
                        .totalTokens(0L)
                        .build()
                )
                .temperature(0.0)
                .topP(0.0)
                .build()

        val roundtrippedRun =
            jsonMapper.readValue(jsonMapper.writeValueAsString(run), jacksonTypeRef<Run>())

        assertThat(roundtrippedRun).isEqualTo(run)
    }
}
