package io.flutter.embedding.engine.systemchannels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C3912zo;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class KeyboardChannel {
    public final MethodChannel channel;
    private KeyboardMethodHandler keyboardMethodHandler;

    @NonNull
    public final MethodChannel.MethodCallHandler parsingMethodHandler;

    /* renamed from: io.flutter.embedding.engine.systemchannels.KeyboardChannel$1 */
    public class C44071 implements MethodChannel.MethodCallHandler {
        Map<Long, Long> pressedState = new HashMap();

        public C44071() {
        }

        @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
        public void onMethodCall(@NonNull MethodCall methodCall, @NonNull MethodChannel.Result result) {
            if (KeyboardChannel.this.keyboardMethodHandler == null) {
                result.success(this.pressedState);
                return;
            }
            String str = methodCall.method;
            str.getClass();
            if (!str.equals("getKeyboardState")) {
                result.notImplemented();
                return;
            }
            try {
                this.pressedState = KeyboardChannel.this.keyboardMethodHandler.getKeyboardState();
            } catch (IllegalStateException e) {
                result.error(C3912zo.a.f13038g, e.getMessage(), null);
            }
            result.success(this.pressedState);
        }
    }

    public interface KeyboardMethodHandler {
        Map<Long, Long> getKeyboardState();
    }

    public KeyboardChannel(@NonNull BinaryMessenger binaryMessenger) {
        C44071 c44071 = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.KeyboardChannel.1
            Map<Long, Long> pressedState = new HashMap();

            public C44071() {
            }

            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(@NonNull MethodCall methodCall, @NonNull MethodChannel.Result result) {
                if (KeyboardChannel.this.keyboardMethodHandler == null) {
                    result.success(this.pressedState);
                    return;
                }
                String str = methodCall.method;
                str.getClass();
                if (!str.equals("getKeyboardState")) {
                    result.notImplemented();
                    return;
                }
                try {
                    this.pressedState = KeyboardChannel.this.keyboardMethodHandler.getKeyboardState();
                } catch (IllegalStateException e) {
                    result.error(C3912zo.a.f13038g, e.getMessage(), null);
                }
                result.success(this.pressedState);
            }
        };
        this.parsingMethodHandler = c44071;
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "flutter/keyboard", StandardMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(c44071);
    }

    public void setKeyboardMethodHandler(@Nullable KeyboardMethodHandler keyboardMethodHandler) {
        this.keyboardMethodHandler = keyboardMethodHandler;
    }
}
