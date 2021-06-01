/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml.get_overall_buckets.Request
public final class GetOverallBucketsRequest extends RequestBase implements ToJsonp {
	private final String jobId;

	@Nullable
	private final JsonValue bucketSpan;

	@Nullable
	private final JsonValue overallScore;

	@Nullable
	private final Number topN;

	@Nullable
	private final JsonValue end;

	@Nullable
	private final JsonValue start;

	@Nullable
	private final Boolean excludeInterim;

	@Nullable
	private final Boolean allowNoMatch;

	@Nullable
	private final Boolean allowNoJobs;

	// ---------------------------------------------------------------------------------------------

	protected GetOverallBucketsRequest(Builder builder) {

		this.jobId = Objects.requireNonNull(builder.jobId, "job_id");
		this.bucketSpan = builder.bucketSpan;
		this.overallScore = builder.overallScore;
		this.topN = builder.topN;
		this.end = builder.end;
		this.start = builder.start;
		this.excludeInterim = builder.excludeInterim;
		this.allowNoMatch = builder.allowNoMatch;
		this.allowNoJobs = builder.allowNoJobs;

	}

	/**
	 * Identifier for the anomaly detection job. It can be a job identifier, a group
	 * name, a comma-separated list of jobs or groups, or a wildcard expression.
	 *
	 * API name: {@code job_id}
	 */
	public String jobId() {
		return this.jobId;
	}

	/**
	 * The span of the overall buckets. Must be greater or equal to the largest
	 * bucket span of the specified anomaly detection jobs, which is the default
	 * value.
	 *
	 * API name: {@code bucket_span}
	 */
	@Nullable
	public JsonValue bucketSpan() {
		return this.bucketSpan;
	}

	/**
	 * Returns overall buckets with overall scores greater than or equal to this
	 * value.
	 *
	 * API name: {@code overall_score}
	 */
	@Nullable
	public JsonValue overallScore() {
		return this.overallScore;
	}

	/**
	 * The number of top anomaly detection job bucket scores to be used in the
	 * overall_score calculation.
	 *
	 * API name: {@code top_n}
	 */
	@Nullable
	public Number topN() {
		return this.topN;
	}

	/**
	 * Returns overall buckets with timestamps earlier than this time.
	 *
	 * API name: {@code end}
	 */
	@Nullable
	public JsonValue end() {
		return this.end;
	}

	/**
	 * Returns overall buckets with timestamps after this time.
	 *
	 * API name: {@code start}
	 */
	@Nullable
	public JsonValue start() {
		return this.start;
	}

	/**
	 * If true, the output excludes interim results. By default, interim results are
	 * included.
	 *
	 * API name: {@code exclude_interim}
	 */
	@Nullable
	public Boolean excludeInterim() {
		return this.excludeInterim;
	}

	/**
	 * API name: {@code allow_no_match}
	 */
	@Nullable
	public Boolean allowNoMatch() {
		return this.allowNoMatch;
	}

	/**
	 * API name: {@code allow_no_jobs}
	 */
	@Nullable
	public Boolean allowNoJobs() {
		return this.allowNoJobs;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.allowNoJobs != null) {

			generator.writeKey("allow_no_jobs");
			generator.write(this.allowNoJobs);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetOverallBucketsRequest}.
	 */
	public static class Builder implements ObjectBuilder<GetOverallBucketsRequest> {
		private String jobId;

		@Nullable
		private JsonValue bucketSpan;

		@Nullable
		private JsonValue overallScore;

		@Nullable
		private Number topN;

		@Nullable
		private JsonValue end;

		@Nullable
		private JsonValue start;

		@Nullable
		private Boolean excludeInterim;

		@Nullable
		private Boolean allowNoMatch;

		@Nullable
		private Boolean allowNoJobs;

		/**
		 * Identifier for the anomaly detection job. It can be a job identifier, a group
		 * name, a comma-separated list of jobs or groups, or a wildcard expression.
		 *
		 * API name: {@code job_id}
		 */
		public Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * The span of the overall buckets. Must be greater or equal to the largest
		 * bucket span of the specified anomaly detection jobs, which is the default
		 * value.
		 *
		 * API name: {@code bucket_span}
		 */
		public Builder bucketSpan(@Nullable JsonValue value) {
			this.bucketSpan = value;
			return this;
		}

		/**
		 * Returns overall buckets with overall scores greater than or equal to this
		 * value.
		 *
		 * API name: {@code overall_score}
		 */
		public Builder overallScore(@Nullable JsonValue value) {
			this.overallScore = value;
			return this;
		}

		/**
		 * The number of top anomaly detection job bucket scores to be used in the
		 * overall_score calculation.
		 *
		 * API name: {@code top_n}
		 */
		public Builder topN(@Nullable Number value) {
			this.topN = value;
			return this;
		}

		/**
		 * Returns overall buckets with timestamps earlier than this time.
		 *
		 * API name: {@code end}
		 */
		public Builder end(@Nullable JsonValue value) {
			this.end = value;
			return this;
		}

		/**
		 * Returns overall buckets with timestamps after this time.
		 *
		 * API name: {@code start}
		 */
		public Builder start(@Nullable JsonValue value) {
			this.start = value;
			return this;
		}

		/**
		 * If true, the output excludes interim results. By default, interim results are
		 * included.
		 *
		 * API name: {@code exclude_interim}
		 */
		public Builder excludeInterim(@Nullable Boolean value) {
			this.excludeInterim = value;
			return this;
		}

		/**
		 * API name: {@code allow_no_match}
		 */
		public Builder allowNoMatch(@Nullable Boolean value) {
			this.allowNoMatch = value;
			return this;
		}

		/**
		 * API name: {@code allow_no_jobs}
		 */
		public Builder allowNoJobs(@Nullable Boolean value) {
			this.allowNoJobs = value;
			return this;
		}

		/**
		 * Builds a {@link GetOverallBucketsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetOverallBucketsRequest build() {

			return new GetOverallBucketsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for GetOverallBucketsRequest
	 */
	public static final JsonpValueParser<GetOverallBucketsRequest> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, GetOverallBucketsRequest::setupGetOverallBucketsRequestParser);

	protected static void setupGetOverallBucketsRequestParser(
			DelegatingJsonpValueParser<GetOverallBucketsRequest.Builder> op) {

		op.add(Builder::allowNoJobs, JsonpValueParser.booleanParser(), "allow_no_jobs");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.get_overall_buckets}".
	 */
	public static final Endpoint<GetOverallBucketsRequest, GetOverallBucketsResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				final int jobId = 1 << 0;

				int propsSet = 0;

				if (request.jobId() != null)
					propsSet |= jobId;

				if (propsSet == (0 | 0 | jobId | 0 | 0))
					return "POST";
				throw Endpoint.Simple.noPathTemplateFound("method");

			},

			// Request path
			request -> {
				final int jobId = 1 << 0;

				int propsSet = 0;

				if (request.jobId() != null)
					propsSet |= jobId;

				if (propsSet == (0 | 0 | jobId | 0 | 0)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/anomaly_detectors");
					buf.append("/");
					buf.append(request.jobId);
					buf.append("/results");
					buf.append("/overall_buckets");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.bucketSpan != null) {
					params.put("bucket_span", request.bucketSpan.toString());
				}
				if (request.overallScore != null) {
					params.put("overall_score", request.overallScore.toString());
				}
				if (request.topN != null) {
					params.put("top_n", request.topN.toString());
				}
				if (request.end != null) {
					params.put("end", request.end.toString());
				}
				if (request.start != null) {
					params.put("start", request.start.toString());
				}
				if (request.excludeInterim != null) {
					params.put("exclude_interim", String.valueOf(request.excludeInterim));
				}
				if (request.allowNoMatch != null) {
					params.put("allow_no_match", String.valueOf(request.allowNoMatch));
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, GetOverallBucketsResponse.JSONP_PARSER);
}