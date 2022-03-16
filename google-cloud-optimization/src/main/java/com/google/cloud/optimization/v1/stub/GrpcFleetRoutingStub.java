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

package com.google.cloud.optimization.v1.stub;

import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.optimization.v1.AsyncModelMetadata;
import com.google.cloud.optimization.v1.BatchOptimizeToursRequest;
import com.google.cloud.optimization.v1.BatchOptimizeToursResponse;
import com.google.cloud.optimization.v1.OptimizeToursRequest;
import com.google.cloud.optimization.v1.OptimizeToursResponse;
import com.google.common.collect.ImmutableMap;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.GrpcOperationsStub;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * gRPC stub implementation for the FleetRouting service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcFleetRoutingStub extends FleetRoutingStub {
  private static final MethodDescriptor<OptimizeToursRequest, OptimizeToursResponse>
      optimizeToursMethodDescriptor =
          MethodDescriptor.<OptimizeToursRequest, OptimizeToursResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.optimization.v1.FleetRouting/OptimizeTours")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(OptimizeToursRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(OptimizeToursResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<BatchOptimizeToursRequest, Operation>
      batchOptimizeToursMethodDescriptor =
          MethodDescriptor.<BatchOptimizeToursRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.optimization.v1.FleetRouting/BatchOptimizeTours")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(BatchOptimizeToursRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private final UnaryCallable<OptimizeToursRequest, OptimizeToursResponse> optimizeToursCallable;
  private final UnaryCallable<BatchOptimizeToursRequest, Operation> batchOptimizeToursCallable;
  private final OperationCallable<
          BatchOptimizeToursRequest, BatchOptimizeToursResponse, AsyncModelMetadata>
      batchOptimizeToursOperationCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcFleetRoutingStub create(FleetRoutingStubSettings settings)
      throws IOException {
    return new GrpcFleetRoutingStub(settings, ClientContext.create(settings));
  }

  public static final GrpcFleetRoutingStub create(ClientContext clientContext) throws IOException {
    return new GrpcFleetRoutingStub(FleetRoutingStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcFleetRoutingStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcFleetRoutingStub(
        FleetRoutingStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcFleetRoutingStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcFleetRoutingStub(FleetRoutingStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcFleetRoutingCallableFactory());
  }

  /**
   * Constructs an instance of GrpcFleetRoutingStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcFleetRoutingStub(
      FleetRoutingStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<OptimizeToursRequest, OptimizeToursResponse> optimizeToursTransportSettings =
        GrpcCallSettings.<OptimizeToursRequest, OptimizeToursResponse>newBuilder()
            .setMethodDescriptor(optimizeToursMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("parent", String.valueOf(request.getParent()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<BatchOptimizeToursRequest, Operation> batchOptimizeToursTransportSettings =
        GrpcCallSettings.<BatchOptimizeToursRequest, Operation>newBuilder()
            .setMethodDescriptor(batchOptimizeToursMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("parent", String.valueOf(request.getParent()));
                  return params.build();
                })
            .build();

    this.optimizeToursCallable =
        callableFactory.createUnaryCallable(
            optimizeToursTransportSettings, settings.optimizeToursSettings(), clientContext);
    this.batchOptimizeToursCallable =
        callableFactory.createUnaryCallable(
            batchOptimizeToursTransportSettings,
            settings.batchOptimizeToursSettings(),
            clientContext);
    this.batchOptimizeToursOperationCallable =
        callableFactory.createOperationCallable(
            batchOptimizeToursTransportSettings,
            settings.batchOptimizeToursOperationSettings(),
            clientContext,
            operationsStub);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<OptimizeToursRequest, OptimizeToursResponse> optimizeToursCallable() {
    return optimizeToursCallable;
  }

  @Override
  public UnaryCallable<BatchOptimizeToursRequest, Operation> batchOptimizeToursCallable() {
    return batchOptimizeToursCallable;
  }

  @Override
  public OperationCallable<
          BatchOptimizeToursRequest, BatchOptimizeToursResponse, AsyncModelMetadata>
      batchOptimizeToursOperationCallable() {
    return batchOptimizeToursOperationCallable;
  }

  @Override
  public final void close() {
    try {
      backgroundResources.close();
    } catch (RuntimeException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException("Failed to close resource", e);
    }
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
