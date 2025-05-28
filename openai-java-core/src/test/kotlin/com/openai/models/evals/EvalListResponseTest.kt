// File generated from our OpenAPI spec by Stainless.

package com.openai.models.evals

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openai.core.JsonValue
import com.openai.core.jsonMapper
import com.openai.models.graders.gradermodels.LabelModelGrader
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EvalListResponseTest {

    @Test
    fun create() {
        val evalListResponse =
            EvalListResponse.builder()
                .id("id")
                .createdAt(0L)
                .customDataSourceConfig(
                    EvalCustomDataSourceConfig.Schema.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .metadata(
                    EvalListResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .name("Chatbot effectiveness Evaluation")
                .addTestingCriterion(
                    LabelModelGrader.builder()
                        .addInput(
                            LabelModelGrader.Input.builder()
                                .content("string")
                                .role(LabelModelGrader.Input.Role.USER)
                                .type(LabelModelGrader.Input.Type.MESSAGE)
                                .build()
                        )
                        .addLabel("string")
                        .model("model")
                        .name("name")
                        .addPassingLabel("string")
                        .build()
                )
                .build()

        assertThat(evalListResponse.id()).isEqualTo("id")
        assertThat(evalListResponse.createdAt()).isEqualTo(0L)
        assertThat(evalListResponse.dataSourceConfig())
            .isEqualTo(
                EvalListResponse.DataSourceConfig.ofCustom(
                    EvalCustomDataSourceConfig.builder()
                        .schema(
                            EvalCustomDataSourceConfig.Schema.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
            )
        assertThat(evalListResponse.metadata())
            .contains(
                EvalListResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(evalListResponse.name()).isEqualTo("Chatbot effectiveness Evaluation")
        assertThat(evalListResponse.testingCriteria())
            .containsExactly(
                EvalListResponse.TestingCriterion.ofLabelModelGrader(
                    LabelModelGrader.builder()
                        .addInput(
                            LabelModelGrader.Input.builder()
                                .content("string")
                                .role(LabelModelGrader.Input.Role.USER)
                                .type(LabelModelGrader.Input.Type.MESSAGE)
                                .build()
                        )
                        .addLabel("string")
                        .model("model")
                        .name("name")
                        .addPassingLabel("string")
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val evalListResponse =
            EvalListResponse.builder()
                .id("id")
                .createdAt(0L)
                .customDataSourceConfig(
                    EvalCustomDataSourceConfig.Schema.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .metadata(
                    EvalListResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .name("Chatbot effectiveness Evaluation")
                .addTestingCriterion(
                    LabelModelGrader.builder()
                        .addInput(
                            LabelModelGrader.Input.builder()
                                .content("string")
                                .role(LabelModelGrader.Input.Role.USER)
                                .type(LabelModelGrader.Input.Type.MESSAGE)
                                .build()
                        )
                        .addLabel("string")
                        .model("model")
                        .name("name")
                        .addPassingLabel("string")
                        .build()
                )
                .build()

        val roundtrippedEvalListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(evalListResponse),
                jacksonTypeRef<EvalListResponse>(),
            )

        assertThat(roundtrippedEvalListResponse).isEqualTo(evalListResponse)
    }
}
