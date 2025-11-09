package com.unity3d.services.ads.token;

import OooOOo0.o0ooOOo;
import com.google.android.gms.internal.measurement.o0OOO0;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.reader.GameSessionIdReader;
import com.unity3d.services.core.device.reader.builder.DeviceInfoReaderBuilder;
import com.unity3d.services.core.p012di.IServiceComponent;
import com.unity3d.services.core.p012di.IServiceProvider;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.OooOo;
import o00O0ooo.o0OO;
import o00O0ooo.o0o0000;
import o00O0ooo.oO00000o;
import oo00o.OooO0OO;
import oo00o.OooO0o;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class InMemoryTokenStorage implements TokenStorage, IServiceComponent {
    private final ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
    private final o0OO accessCounter = o0o0000.OooO0OO(-1);
    private final o0OO initToken = o0o0000.OooO0OO(null);
    private final ExecutorService executorService = Executors.newSingleThreadExecutor();
    private final OooO0OO asyncTokenStorage$delegate = o0OOO0.OooO0oO(OooO0o.f33184OooOo0o, new InMemoryTokenStorage$special$$inlined$inject$default$1(this, ""));

    public static final void _get_nativeGeneratedToken_$lambda$2(String str) {
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.TOKEN, TokenEvent.TOKEN_NATIVE_DATA, str);
    }

    private final AsyncTokenStorage getAsyncTokenStorage() {
        return (AsyncTokenStorage) this.asyncTokenStorage$delegate.getValue();
    }

    private final void triggerTokenAvailable(boolean z) {
        InitializeEventsMetricSender.getInstance().sdkTokenDidBecomeAvailableWithConfig(z);
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public void appendTokens(JSONArray tokens) throws JSONException {
        OooOo.OooO0o0(tokens, "tokens");
        ((oO00000o) this.accessCounter).OooO0oO(-1, 0);
        int length = tokens.length();
        for (int i = 0; i < length; i++) {
            this.queue.add(tokens.getString(i));
        }
        if (length > 0) {
            triggerTokenAvailable(false);
            getAsyncTokenStorage().onTokenAvailable();
        }
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public void createTokens(JSONArray tokens) throws JSONException {
        OooOo.OooO0o0(tokens, "tokens");
        deleteTokens();
        appendTokens(tokens);
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public void deleteTokens() {
        oO00000o oo00000o;
        Object value;
        this.queue.clear();
        o0OO o0oo = this.accessCounter;
        do {
            oo00000o = (oO00000o) o0oo;
            value = oo00000o.getValue();
            ((Number) value).intValue();
        } while (!oo00000o.OooO0oO(value, -1));
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public oo00o.OooOo getNativeGeneratedToken() {
        new NativeTokenGenerator(this.executorService, new DeviceInfoReaderBuilder(new ConfigurationReader(), PrivacyConfigStorage.getInstance(), GameSessionIdReader.getInstance()), null).generateToken(new o0ooOOo(17));
        return oo00o.OooOo.f33195OooO00o;
    }

    @Override // com.unity3d.services.core.p012di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public String getToken() {
        oO00000o oo00000o;
        Object value;
        Number number;
        if (((Number) ((oO00000o) this.accessCounter).getValue()).intValue() == -1) {
            return (String) ((oO00000o) this.initToken).getValue();
        }
        if (this.queue.isEmpty()) {
            WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.TOKEN, TokenEvent.QUEUE_EMPTY, new Object[0]);
            return null;
        }
        o0OO o0oo = this.accessCounter;
        do {
            oo00000o = (oO00000o) o0oo;
            value = oo00000o.getValue();
            number = (Number) value;
        } while (!oo00000o.OooO0oO(value, Integer.valueOf(number.intValue() + 1)));
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.TOKEN, TokenEvent.TOKEN_ACCESS, Integer.valueOf(number.intValue()));
        return this.queue.poll();
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public void setInitToken(String str) {
        oO00000o oo00000o;
        Object value;
        if (str == null) {
            return;
        }
        o0OO o0oo = this.initToken;
        do {
            oo00000o = (oO00000o) o0oo;
            value = oo00000o.getValue();
        } while (!oo00000o.OooO0oO(value, str));
        triggerTokenAvailable(true);
        getAsyncTokenStorage().onTokenAvailable();
    }
}
