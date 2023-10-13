package com.grpc.benchmark.data;

import com.google.protobuf.BoolValue;
import com.google.protobuf.ByteString;
import com.google.protobuf.BytesValue;
import com.google.protobuf.DoubleValue;
import com.google.protobuf.Int32Value;
import com.google.protobuf.StringValue;
import com.grpc.benchmark.model.ExamplePayload;
import com.grpc.benchmark.model.ExampleWrapperPayload;
import com.grpc.benchmark.model.JsonExamplePayload;
import io.vertx.core.json.JsonObject;

public class PlaceholderData {
    static public ExampleWrapperPayload getWrapperPayload() {
        return ExampleWrapperPayload.newBuilder()
                .setIntField(Int32Value.newBuilder().setValue(42).build())
                .setStringField(StringValue.newBuilder().setValue("Test String").build())
                .setBoolField(BoolValue.newBuilder().setValue(true).build())
                .setDoubleField(DoubleValue.newBuilder().setValue(42.42).build())
                .setBytesField(BytesValue.newBuilder().setValue(ByteString.copyFromUtf8("Test Bytes")).build())
                .build();
    }

    static public ExamplePayload getProtoPayload() {
        return ExamplePayload.newBuilder()
                .setIntField(42)
                .setStringField("Test String")
                .setBoolField(true)
                .setDoubleField(42.42)
                .setBytesField(ByteString.copyFromUtf8("Test Bytes"))
                .build();
    }

    static public JsonExamplePayload getJsonPayload() {
        JsonExamplePayload payload = new JsonExamplePayload();
        payload.setBoolField(true);
        payload.setBytesField("Test Bytes".getBytes());
        payload.setIntField(42);
        payload.setStringField("Test String");
        payload.setDoubleField(42.42);
        return payload;
    }

    static public JsonObject getJsonObjectPayload() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.put("boolField", true);
        jsonObject.put("bytesField", "Test Bytes".getBytes());
        jsonObject.put("intField", 42);
        jsonObject.put("stringField", "Test String");
        jsonObject.put("doubleField", 42.42);
        return jsonObject;
    }
}
