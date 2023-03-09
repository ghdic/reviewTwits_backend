package com.developlife.reviewtwits.project;

import org.springframework.restdocs.payload.JsonFieldType;
import org.springframework.restdocs.snippet.Snippet;

import static com.developlife.reviewtwits.DocumentFormatProvider.required;
import static org.springframework.restdocs.payload.PayloadDocumentation.*;
import static org.springframework.restdocs.request.RequestDocumentation.parameterWithName;
import static org.springframework.restdocs.request.RequestDocumentation.pathParameters;
import static org.springframework.restdocs.headers.HeaderDocumentation.headerWithName;
import static org.springframework.restdocs.headers.HeaderDocumentation.requestHeaders;

/**
 * @author ghdic
 * @since 2023/03/09
 */
public class ProjectDocument {
    public static final Snippet RegisterProjectRequestField = requestFields(
            fieldWithPath("projectName").type(JsonFieldType.STRING).attributes(required()).description("프로젝트 이름 최대(최소2글자 최대 50글자)"),
            fieldWithPath("projectDescription").type(JsonFieldType.STRING).attributes(required()).description("프로젝트 설명(최대 200글자)"),
            fieldWithPath("uriPattern").type(JsonFieldType.STRING).attributes(required()).description("서비스 로드 되게할 URI패턴 “,”으로 구분 되게 여러개 적을 수 있음"),
            fieldWithPath("category").type(JsonFieldType.STRING).attributes(required()).description("카테고리(쇼핑, 영화, 게임)"),
            fieldWithPath("language").type(JsonFieldType.STRING).attributes(required()).description("서비스 언어(한국어, ENGLISH)"),
            fieldWithPath("projectColor").type(JsonFieldType.STRING).attributes(required()).description("프로젝트 색깔 hex코드"),
            fieldWithPath("pricePlan").type(JsonFieldType.STRING).description("가격 플랜").optional()
    );
}