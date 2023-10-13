package com.grpc.benchmark.data;

import com.google.protobuf.BoolValue;
import com.google.protobuf.ByteString;
import com.google.protobuf.BytesValue;
import com.google.protobuf.DoubleValue;
import com.google.protobuf.Int32Value;
import com.google.protobuf.StringValue;
import com.grpc.benchmark.model.ExamplePayload;
import com.grpc.benchmark.model.JsonExamplePayload;

public class PlaceholderData {
    static public ExamplePayload getProtoPayload() {
        return ExamplePayload.newBuilder()
                .setIntField(Int32Value.newBuilder().setValue(42).build())
                .setStringField(StringValue.newBuilder().setValue("Test String").build())
                .setBoolField(BoolValue.newBuilder().setValue(true).build())
                .setDoubleField(DoubleValue.newBuilder().setValue(42.42).build())
                .setBytesField(BytesValue.newBuilder().setValue(ByteString.copyFromUtf8("Test Bytes")).build())
                .setPayload(ByteString.copyFromUtf8("Raw Payload"))
                .build();
    }

    static public JsonExamplePayload getJsonPayload() {
        JsonExamplePayload payload = new JsonExamplePayload();
        payload.setBoolField(true);
        payload.setBytesField("Test Bytes".getBytes());
        payload.setIntField(42);
        payload.setStringField("Test String");
        payload.setDoubleField(42.42);
        payload.setPayload("Raw Payload".getBytes());
        return payload;
    }
}
