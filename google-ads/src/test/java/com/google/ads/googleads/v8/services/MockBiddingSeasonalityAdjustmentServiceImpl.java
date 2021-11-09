/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.ads.googleads.v8.services;

import com.google.ads.googleads.v8.resources.BiddingSeasonalityAdjustment;
import com.google.ads.googleads.v8.services.BiddingSeasonalityAdjustmentServiceGrpc.BiddingSeasonalityAdjustmentServiceImplBase;
import com.google.api.core.BetaApi;
import com.google.protobuf.AbstractMessage;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.annotation.Generated;

@BetaApi
@Generated("by gapic-generator-java")
public class MockBiddingSeasonalityAdjustmentServiceImpl
    extends BiddingSeasonalityAdjustmentServiceImplBase {
  private List<AbstractMessage> requests;
  private Queue<Object> responses;

  public MockBiddingSeasonalityAdjustmentServiceImpl() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  public List<AbstractMessage> getRequests() {
    return requests;
  }

  public void addResponse(AbstractMessage response) {
    responses.add(response);
  }

  public void setResponses(List<AbstractMessage> responses) {
    this.responses = new LinkedList<Object>(responses);
  }

  public void addException(Exception exception) {
    responses.add(exception);
  }

  public void reset() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  @Override
  public void getBiddingSeasonalityAdjustment(
      GetBiddingSeasonalityAdjustmentRequest request,
      StreamObserver<BiddingSeasonalityAdjustment> responseObserver) {
    Object response = responses.poll();
    if (response instanceof BiddingSeasonalityAdjustment) {
      requests.add(request);
      responseObserver.onNext(((BiddingSeasonalityAdjustment) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method GetBiddingSeasonalityAdjustment, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  BiddingSeasonalityAdjustment.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void mutateBiddingSeasonalityAdjustments(
      MutateBiddingSeasonalityAdjustmentsRequest request,
      StreamObserver<MutateBiddingSeasonalityAdjustmentsResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof MutateBiddingSeasonalityAdjustmentsResponse) {
      requests.add(request);
      responseObserver.onNext(((MutateBiddingSeasonalityAdjustmentsResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method MutateBiddingSeasonalityAdjustments, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  MutateBiddingSeasonalityAdjustmentsResponse.class.getName(),
                  Exception.class.getName())));
    }
  }
}