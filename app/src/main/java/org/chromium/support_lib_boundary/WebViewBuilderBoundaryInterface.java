package org.chromium.support_lib_boundary;

import android.content.Context;
import android.webkit.WebView;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public interface WebViewBuilderBoundaryInterface {

    @Retention(RetentionPolicy.SOURCE)
    public @interface Baseline {
        public static final int DEFAULT = 0;
    }

    public static class Config implements Consumer<BiConsumer<Integer, Object>> {
        public int baseline = 0;

        /* renamed from: OooOo0O, reason: collision with root package name */
        public final ArrayList f33328OooOo0O = new ArrayList();

        /* renamed from: OooOo0o, reason: collision with root package name */
        public final ArrayList f33329OooOo0o = new ArrayList();

        /* renamed from: OooOo, reason: collision with root package name */
        public final ArrayList f33327OooOo = new ArrayList();

        public void addJavascriptInterface(Object obj, String str, List<String> list) {
            this.f33328OooOo0O.add(obj);
            this.f33329OooOo0o.add(str);
            this.f33327OooOo.add(list);
        }

        @Override // java.util.function.Consumer
        public void accept(BiConsumer<Integer, Object> biConsumer) {
            biConsumer.accept(0, Integer.valueOf(this.baseline));
            biConsumer.accept(1, new Object[]{this.f33328OooOo0O, this.f33329OooOo0o, this.f33327OooOo});
        }
    }

    @Target({ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ConfigField {
        public static final int BASELINE = 0;
        public static final int JAVASCRIPT_INTERFACE = 1;
    }

    WebView build(Context context, Consumer<BiConsumer<Integer, Object>> consumer);
}
