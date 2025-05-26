// File generated from our OpenAPI spec by Stainless.

package com.openai.models.evals

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.openai.core.JsonValue
import com.openai.core.jsonMapper
import com.openai.models.graders.gradermodels.LabelModelGrader
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EvalUpdateResponseTest {

    @Test
    fun create() {
        val evalUpdateResponse =
            EvalUpdateResponse.builder()
                .id("id")
                .createdAt(0L)
                .customDataSourceConfig(
                    EvalCustomDataSourceConfig.Schema.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .metadata(
                    EvalUpdateResponse.Metadata.builder()
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

        assertThat(evalUpdateResponse.id()).isEqualTo("id")
        assertThat(evalUpdateResponse.createdAt()).isEqualTo(0L)
        assertThat(evalUpdateResponse.dataSourceConfig())
            .isEqualTo(
                EvalUpdateResponse.DataSourceConfig.ofCustom(
                    EvalCustomDataSourceConfig.builder()
                        .schema(
                            EvalCustomDataSourceConfig.Schema.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
            )
        assertThat(evalUpdateResponse.metadata())
            .contains(
                EvalUpdateResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(evalUpdateResponse.name()).isEqualTo("Chatbot effectiveness Evaluation")
        assertThat(evalUpdateResponse.testingCriteria())
            .containsExactly(
                EvalUpdateResponse.TestingCriterion.ofLabelModelGrader(
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
        val evalUpdateResponse =
            EvalUpdateResponse.builder()
                .id("id")
                .createdAt(0L)
                .customDataSourceConfig(
                    EvalCustomDataSourceConfig.Schema.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .metadata(
                    EvalUpdateResponse.Metadata.builder()
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

        val roundtrippedEvalUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(evalUpdateResponse),
                jacksonTypeRef<EvalUpdateResponse>(),
            )

        assertThat(roundtrippedEvalUpdateResponse).isEqualTo(evalUpdateResponse)
    }
}
