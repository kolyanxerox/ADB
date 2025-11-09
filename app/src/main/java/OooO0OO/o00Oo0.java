package OooO0oo;

import OooOOO.OooO0o;
import OooOOOO.OooO0OO;
import OooOOOo.o0OoOo0;
import OooOOo0.o0ooOOo;
import OooOo.OooO;
import OooOo0o.Oooo0;
import OooOoO0.oo0o0Oo;
import Oooo.OooOo00;
import Oooo0oO.o00000;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AutoCompleteTextView;
import androidx.arch.core.util.Function;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewStartUpResult;
import com.applovin.applovin_max.AppLovinMAXAdView;
import com.applovin.applovin_max.AppLovinMAXNativeAdView;
import com.applovin.impl.C1026f5;
import com.applovin.impl.sdk.C1212c;
import com.applovin.impl.sdk.C1213d;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.applovin.shadow.okhttp3.Call;
import com.applovin.shadow.okhttp3.EventListener;
import com.applovin.shadow.okhttp3.internal.Util;
import com.google.android.gms.internal.ads.C2051sk;
import com.google.android.gms.internal.measurement.o0OO00OO;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.ironsource.C3037dc;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.webview.WebView;
import io.flutter.embedding.android.KeyboardManager;
import io.flutter.embedding.engine.systemchannels.KeyEventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin;
import io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.internal.OooOo;
import o0000oo0.o00oO0o;
import o000O000.OooO00o;
import o000O000.OooO0O0;
import o000OO0o.OooOO0O;
import o000Oo00.OooOOO;
import o000Oo00.OooOOO0;
import o000Ooo0.OooOO0;
import o000OooO.o0OO00O;
import o000Oooo.o0000O0O;
import o000Oooo.o000OOo;
import o000o00.o0O00o0;
import o000o00o.o000O0Oo;
import o000o00o.o000OO0O;
import o000o00o.oo000o;
import org.apache.tika.metadata.HttpHeaders;

/* loaded from: classes.dex */
public final /* synthetic */ class o00Oo0 implements EventListener.Factory, oo0o0Oo, AccessibilityViewCommand, InputConnectionCompat.OnCommitContentListener, WebViewCompat.WebViewStartUpCallback, MethodChannel.MethodCallHandler, Function, C1212c.b, OnApplyWindowInsetsListener, KeyEventChannel.EventResponseHandler, OnCompleteListener, o00oO0o, AccessibilityManagerCompat.TouchExplorationStateChangeListener, OooOOO0, Continuation, SuccessContinuation, OooO0o {

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f13301OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ Object f13302OooOo0o;

    public /* synthetic */ o00Oo0(Object obj, int i) {
        this.f13301OooOo0O = i;
        this.f13302OooOo0o = obj;
    }

    @Override // o000Oo00.OooOOO0
    public void OooO00o(OooOOO oooOOO) {
        switch (this.f13301OooOo0O) {
            case 21:
                OooO00o oooO00o = (OooO00o) this.f13302OooOo0o;
                oooO00o.getClass();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
                }
                oooO00o.f30093OooO0O0.set((OooO00o) oooOOO.get());
                break;
            default:
                C2051sk c2051sk = ((o0OO00O) ((o0O00o0) oooOOO.get())).OooO00o().f30554OooOO0O;
                Set set = (Set) c2051sk.f24099OooOoO;
                OooO0O0 oooO0O0 = (OooO0O0) this.f13302OooOo0o;
                set.add(oooO0O0);
                Task taskOooO0O0 = ((o000OOo) c2051sk.f24098OooOo0o).OooO0O0();
                taskOooO0O0.addOnSuccessListener((Executor) c2051sk.f24100OooOoO0, new OooO(c2051sk, taskOooO0O0, oooO0O0, 12));
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Registering RemoteConfig Rollouts subscriber", null);
                    break;
                }
                break;
        }
    }

    public OooOOOO.OooO0O0 OooO0O0(OooOo00 oooOo00) throws IOException {
        OooO0OO oooO0OO = (OooO0OO) this.f13302OooOo0o;
        String strOooOo0O = o0OO00OO.OooOo0O("CctTransportBackend");
        boolean zIsLoggable = Log.isLoggable(strOooOo0O, 4);
        URL url = (URL) oooOo00.f13712OooOo0o;
        if (zIsLoggable) {
            Log.i(strOooOo0O, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(oooO0OO.f13337OooO0oO);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_ENCODING, "gzip");
        httpURLConnection.setRequestProperty("Content-Type", C3037dc.f8236L);
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) oooOo00.f13713OooOoO0;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    OooOO0 oooOO0 = oooO0OO.f13331OooO00o;
                    o0OoOo0 o0oooo0 = (o0OoOo0) oooOo00.f13710OooOo;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    OooOO0O oooOO0O = (OooOO0O) oooOO0.f30538OooOo0o;
                    o000OO0o.OooOOO0 oooOOO0 = new o000OO0o.OooOOO0(bufferedWriter, oooOO0O.f30224OooO00o, oooOO0O.f30225OooO0O0, oooOO0O.f30226OooO0OO, oooOO0O.f30227OooO0Oo);
                    oooOOO0.OooO0oo(o0oooo0);
                    oooOOO0.OooOO0();
                    oooOOO0.f30229OooO0O0.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    String strOooOo0O2 = o0OO00OO.OooOo0O("CctTransportBackend");
                    if (Log.isLoggable(strOooOo0O2, 4)) {
                        Log.i(strOooOo0O2, String.format("Status Code: %d", numValueOf));
                    }
                    o0OO00OO.OooO0oo("CctTransportBackend", httpURLConnection.getHeaderField("Content-Type"), "Content-Type: %s");
                    o0OO00OO.OooO0oo("CctTransportBackend", httpURLConnection.getHeaderField(HttpHeaders.CONTENT_ENCODING), "Content-Encoding: %s");
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new OooOOOO.OooO0O0(responseCode, new URL(httpURLConnection.getHeaderField(HttpHeaders.LOCATION)), 0L);
                    }
                    if (responseCode != 200) {
                        return new OooOOOO.OooO0O0(responseCode, (URL) null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField(HttpHeaders.CONTENT_ENCODING)) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            OooOOOO.OooO0O0 oooO0O0 = new OooOOOO.OooO0O0(responseCode, (URL) null, OooOOOo.o0OO00O.OooO00o(new BufferedReader(new InputStreamReader(gZIPInputStream))).f13412OooO00o);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return oooO0O0;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (ConnectException e) {
            e = e;
            o0OO00OO.OooOo00("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new OooOOOO.OooO0O0(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE, (URL) null, 0L);
        } catch (UnknownHostException e2) {
            e = e2;
            o0OO00OO.OooOo00("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new OooOOOO.OooO0O0(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE, (URL) null, 0L);
        } catch (IOException e3) {
            e = e3;
            o0OO00OO.OooOo00("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new OooOOOO.OooO0O0(CommonGatewayClient.CODE_400, (URL) null, 0L);
        } catch (o000OO00.OooO0O0 e4) {
            e = e4;
            o0OO00OO.OooOo00("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new OooOOOO.OooO0O0(CommonGatewayClient.CODE_400, (URL) null, 0L);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:174|(1:176)(1:177)|178|(1:180)|(1:182)(1:183)|184|(20:188|204|(1:206)|207|(1:209)|210|(3:212|(3:328|214|331)(1:330)|329)|327|215|324|216|(1:218)|219|220|(1:222)|223|(1:225)|(1:227)(1:228)|229|(2:230|(3:232|(2:234|333)(1:334)|235)(14:332|236|(1:238)|335|239|(1:241)(1:242)|(1:244)(1:245)|246|(5:251|(1:253)|254|3f3|258)(1:250)|259|(11:269|(3:271|(1:273)|274)(2:275|(2:305|306))|277|320|278|318|279|280|282|(4:291|299|(1:301)|302)(3:292|(1:294)|295)|304)(11:263|(1:265)(2:266|(1:268)(0))|(0)(0)|277|320|278|318|279|280|282|(7:284|286|291|299|(0)|302|304)(0))|312|(2:314|(1:316))|317)))(3:189|(3:193|201|(1:203))(4:194|(2:197|195)|326|198)|199)|200|207|(0)|210|(0)|327|215|324|216|(0)|219|220|(0)|223|(0)|(0)(0)|229|(3:230|(0)(0)|235)) */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x062e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x062f, code lost:
    
        r2 = "FirebaseCrashlytics";
        android.util.Log.e(r2, "Error retrieving app package info.", r0);
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:209:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x031b A[SYNTHETIC] */
    @Override // o0000oo0.o00oO0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object OooO0OO(o000O0Oo.OooO0o r52) throws android.content.res.Resources.NotFoundException, android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 1640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OooO0oo.o00Oo0.OooO0OO(o000O0Oo.OooO0o):java.lang.Object");
    }

    @Override // com.applovin.impl.sdk.C1212c.b
    /* renamed from: a */
    public void mo0a(C1212c.a aVar) {
        ((C1213d) this.f13302OooOo0o).m2690c(aVar);
    }

    @Override // androidx.arch.core.util.Function, OooOOO.OooO0o
    public Object apply(Object obj) {
        Object obj2 = this.f13302OooOo0o;
        switch (this.f13301OooOo0O) {
            case 11:
                return AbstractC1207b.m2499a((com.applovin.impl.sdk.p005ad.OooO0O0) obj2, (C1026f5) obj);
            default:
                ((o000o00o.o00Oo0) obj2).getClass();
                String strOooO00o = o000OO0O.f30796OooO0O0.OooO00o((o000O0Oo) obj);
                OooOo.OooO0Oo(strOooO00o, "encode(...)");
                oo000o oo000oVar = oo000o.f30892OooOo0o;
                Log.d("FirebaseSessions", "Session Event Type: SESSION_START");
                byte[] bytes = strOooO00o.getBytes(o00O0oO.o0OO00O.f31451OooO00o);
                OooOo.OooO0Oo(bytes, "getBytes(...)");
                return bytes;
        }
    }

    @Override // com.applovin.shadow.okhttp3.EventListener.Factory
    public EventListener create(Call call) {
        return Util.asFactory$lambda$8((EventListener) this.f13302OooOo0o, call);
    }

    @Override // OooOoO0.oo0o0Oo
    public Object execute() {
        SQLiteDatabase sQLiteDatabaseOooO00o;
        Object obj = this.f13302OooOo0o;
        switch (this.f13301OooOo0O) {
            case 2:
                OooOo.OooOo oooOo = (OooOo.OooOo) ((OooOo.OooO0OO) obj);
                oooOo.getClass();
                int i = OooOo00.OooO00o.f13574OooO0o0;
                C2051sk c2051sk = new C2051sk(1, false);
                c2051sk.f24098OooOo0o = null;
                c2051sk.f24096OooOo = new ArrayList();
                c2051sk.f24100OooOoO0 = null;
                c2051sk.f24099OooOoO = "";
                HashMap map = new HashMap();
                sQLiteDatabaseOooO00o = oooOo.OooO00o();
                sQLiteDatabaseOooO00o.beginTransaction();
                try {
                    OooOo00.OooO00o oooO00o = (OooOo00.OooO00o) OooOo.OooOo.OooO(sQLiteDatabaseOooO00o.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new OooO(oooOo, map, c2051sk, 2));
                    sQLiteDatabaseOooO00o.setTransactionSuccessful();
                    return oooO00o;
                } finally {
                }
            case 3:
                OooOo.OooOo oooOo2 = (OooOo.OooOo) ((OooOo.OooO0o) obj);
                long jOooO00o = oooOo2.f13560OooOo0o.OooO00o() - oooOo2.f13562OooOoO0.f13543OooO0Oo;
                sQLiteDatabaseOooO00o = oooOo2.OooO00o();
                sQLiteDatabaseOooO00o.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(jOooO00o)};
                    Cursor cursorRawQuery = sQLiteDatabaseOooO00o.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    try {
                        Cursor cursor = cursorRawQuery;
                        while (cursor.moveToNext()) {
                            oooOo2.OooO0o0(cursor.getInt(0), OooOo00.OooO0OO.MESSAGE_TOO_OLD, cursor.getString(1));
                        }
                        cursorRawQuery.close();
                        int iDelete = sQLiteDatabaseOooO00o.delete("events", "timestamp_ms < ?", strArr);
                        sQLiteDatabaseOooO00o.setTransactionSuccessful();
                        sQLiteDatabaseOooO00o.endTransaction();
                        return Integer.valueOf(iDelete);
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                } finally {
                }
            case 4:
                OooOo.OooOo oooOo3 = (OooOo.OooOo) ((Oooo0) obj).f13630OooO;
                sQLiteDatabaseOooO00o = oooOo3.OooO00o();
                sQLiteDatabaseOooO00o.beginTransaction();
                try {
                    sQLiteDatabaseOooO00o.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseOooO00o.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + oooOo3.f13560OooOo0o.OooO00o()).execute();
                    sQLiteDatabaseOooO00o.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                OooOo0o.o0OoOo0 o0oooo0 = (OooOo0o.o0OoOo0) obj;
                sQLiteDatabaseOooO00o = ((OooOo.OooOo) o0oooo0.f13647OooO0O0).OooO00o();
                sQLiteDatabaseOooO00o.beginTransaction();
                try {
                    List list = (List) OooOo.OooOo.OooO(sQLiteDatabaseOooO00o.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new o0ooOOo(1));
                    sQLiteDatabaseOooO00o.setTransactionSuccessful();
                    sQLiteDatabaseOooO00o.endTransaction();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        o0oooo0.f13648OooO0OO.OooO00o((OooOOo0.oo000o) it.next(), 1, false);
                    }
                    return null;
                } finally {
                }
        }
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        switch (this.f13301OooOo0O) {
            case 13:
                return AndroidWebViewContainer.applySafeAreaInsets$lambda$3((AndroidWebViewContainer) this.f13302OooOo0o, view, windowInsetsCompat);
            default:
                return WebView.applySafeAreaInsets$lambda$3((WebView) this.f13302OooOo0o, view, windowInsetsCompat);
        }
    }

    @Override // androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener
    public boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle) {
        return InputConnectionCompat.lambda$createOnCommitContentListenerUsingPerformReceiveContent$0((View) this.f13302OooOo0o, inputContentInfoCompat, i, bundle);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f13301OooOo0O) {
            case 16:
                FlutterFirebaseCorePlugin.lambda$listenToVoidResponse$2((GeneratedAndroidFirebaseCore.VoidResult) this.f13302OooOo0o, task);
                break;
            default:
                FlutterFirebaseCorePlugin.lambda$listenToResponse$1((GeneratedAndroidFirebaseCore.Result) this.f13302OooOo0o, task);
                break;
        }
    }

    @Override // io.flutter.embedding.engine.systemchannels.KeyEventChannel.EventResponseHandler
    public void onFrameworkResponse(boolean z) {
        ((KeyboardManager.Responder.OnKeyEventHandledCallback) this.f13302OooOo0o).onKeyEventHandled(z);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        switch (this.f13301OooOo0O) {
            case 9:
                ((AppLovinMAXAdView) this.f13302OooOo0o).lambda$new$0(methodCall, result);
                break;
            default:
                ((AppLovinMAXNativeAdView) this.f13302OooOo0o).lambda$new$0(methodCall, result);
                break;
        }
    }

    @Override // androidx.webkit.WebViewCompat.WebViewStartUpCallback
    public void onSuccess(WebViewStartUpResult webViewStartUpResult) {
        WebViewCompat.lambda$startUpWebView$1((WebViewCompat.WebViewStartUpCallback) this.f13302OooOo0o, webViewStartUpResult);
    }

    @Override // androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener
    public void onTouchExplorationStateChanged(boolean z) {
        o00000O0.OooOOO0 oooOOO0 = (o00000O0.OooOOO0) this.f13302OooOo0o;
        AutoCompleteTextView autoCompleteTextView = oooOOO0.f29161OooO0o0;
        if (autoCompleteTextView == null || o00000.OooOO0(autoCompleteTextView)) {
            return;
        }
        ViewCompat.setImportantForAccessibility(oooOOO0.f29199OooO0Oo, z ? 2 : 1);
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        int i = BottomSheetDragHandleView.f27425OooOooo;
        return ((BottomSheetDragHandleView) this.f13302OooOo0o).OooO00o();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z;
        switch (this.f13301OooOo0O) {
            case 23:
                return (Task) ((o000Ooo.oo000o) this.f13302OooOo0o).call();
            case 24:
                ((Runnable) this.f13302OooOo0o).run();
                return Tasks.forResult(null);
            case 25:
                ((o000O0Oo.OooO0o) this.f13302OooOo0o).getClass();
                if (task.isSuccessful()) {
                    o000Ooo.OooOo oooOo = (o000Ooo.OooOo) task.getResult();
                    o000O000.OooO0OO oooO0OO = o000O000.OooO0OO.f30095OooO00o;
                    oooO0OO.OooO0OO("Crashlytics report successfully enqueued to DataTransport: " + oooOo.f30418OooO0O0);
                    File file = oooOo.f30419OooO0OO;
                    if (file.delete()) {
                        oooO0OO.OooO0OO("Deleted report file: " + file.getPath());
                    } else {
                        oooO0OO.OooO0oo(null, "Crashlytics could not delete report file: " + file.getPath());
                    }
                    z = true;
                } else {
                    Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
                    z = false;
                }
                return Boolean.valueOf(z);
            case 26:
                ((CountDownLatch) this.f13302OooOo0o).countDown();
                return null;
            default:
                return (o0000O0O) ((Task) this.f13302OooOo0o).getResult();
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult((o000Oooo.o00000) this.f13302OooOo0o);
    }
}
