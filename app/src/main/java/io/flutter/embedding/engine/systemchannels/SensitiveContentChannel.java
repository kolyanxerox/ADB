package io.flutter.embedding.engine.systemchannels;

import OooO0oO.OooOo;
import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.ironsource.C3912zo;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;

/* loaded from: classes3.dex */
public class SensitiveContentChannel {

    @VisibleForTesting
    public static final int AUTO_SENSITIVE_CONTENT_SENSITIVITY = 0;

    @VisibleForTesting
    public static final int NOT_SENSITIVE_CONTENT_SENSITIVITY = 2;

    @VisibleForTesting
    public static final int SENSITIVE_CONTENT_SENSITIVITY = 1;
    private static final String TAG = "SensitiveContentChannel";

    @VisibleForTesting
    public static final int UNKNOWN_CONTENT_SENSITIVITY = 3;
    public final MethodChannel channel;

    @NonNull
    public final MethodChannel.MethodCallHandler parsingMethodHandler;
    private SensitiveContentMethodHandler sensitiveContentMethodHandler;

    public interface SensitiveContentMethodHandler {
        int getContentSensitivity();

        boolean isSupported();

        void setContentSensitivity(@NonNull int i);
    }

    public SensitiveContentChannel(@NonNull DartExecutor dartExecutor) {
        MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.SensitiveContentChannel.1
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(@NonNull MethodCall methodCall, @NonNull MethodChannel.Result result) {
                String str;
                if (SensitiveContentChannel.this.sensitiveContentMethodHandler == null) {
                    return;
                }
                str = methodCall.method;
                Log.m13463v(SensitiveContentChannel.TAG, "Received '" + str + "' message.");
                str.getClass();
                switch (str) {
                    case "SensitiveContent.getContentSensitivity":
                        try {
                            result.success(Integer.valueOf(SensitiveContentChannel.this.serializeContentSensitivity(SensitiveContentChannel.this.sensitiveContentMethodHandler.getContentSensitivity())));
                            break;
                        } catch (IllegalArgumentException | IllegalStateException e) {
                            result.error(C3912zo.a.f13038g, e.getMessage(), null);
                            return;
                        }
                    case "SensitiveContent.setContentSensitivity":
                        try {
                            SensitiveContentChannel.this.sensitiveContentMethodHandler.setContentSensitivity(SensitiveContentChannel.this.deserializeContentSensitivity(((Integer) methodCall.arguments()).intValue()));
                            break;
                        } catch (IllegalArgumentException | IllegalStateException e2) {
                            result.error(C3912zo.a.f13038g, e2.getMessage(), null);
                            return;
                        }
                    case "SensitiveContent.isSupported":
                        result.success(Boolean.valueOf(SensitiveContentChannel.this.sensitiveContentMethodHandler.isSupported()));
                        break;
                    default:
                        Log.m13463v(SensitiveContentChannel.TAG, "Method " + str + " is not implemented for the SensitiveContentChannel.");
                        result.notImplemented();
                        break;
                }
            }
        };
        this.parsingMethodHandler = methodCallHandler;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/sensitivecontent", StandardMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(methodCallHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"InlinedApi"})
    public int deserializeContentSensitivity(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        throw new IllegalArgumentException(OooOo.OooO0oO(i, "contentSensitivityIndex ", " not known to the SensitiveContentChannel."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"InlinedApi"})
    public int serializeContentSensitivity(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 3;
            }
        }
        return i2;
    }

    public void setSensitiveContentMethodHandler(@Nullable SensitiveContentMethodHandler sensitiveContentMethodHandler) {
        this.sensitiveContentMethodHandler = sensitiveContentMethodHandler;
    }
}
