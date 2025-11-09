package OooOo;

import OooOoO0.oo0o0Oo;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Trace;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import androidx.window.embedding.EmbeddingCompat;
import androidx.window.embedding.EmbeddingInterfaceCompat;
import androidx.window.extensions.core.util.function.Consumer;
import com.applovin.applovin_max.AppLovinMAX;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapters.GoogleMediationAdapter;
import com.applovin.mediation.adapters.UnityAdsMediationAdapter;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseCommonRegistrar;
import com.unity3d.ads.IUnityAdsTokenListener;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import o0000oo0.o00Oo0;
import o0000oo0.o00oO0o;
import o000Oooo.o000000;
import o000Oooo.o000OOo;
import o00O0oOo.o000O0o;

/* loaded from: classes2.dex */
public final /* synthetic */ class OooOO0 implements OooOOOO, oo0o0Oo, CallbackToFutureAdapter.Resolver, Consumer, AppLovinSdk.SdkInitializationListener, OnUserEarnedRewardListener, IUnityAdsTokenListener, o000Oo00.OooOOO0, o00oO0o, SuccessContinuation, Continuation {

    /* renamed from: OooOo */
    public final /* synthetic */ Object f13548OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f13549OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ Object f13550OooOo0o;

    public /* synthetic */ OooOO0(int i, Object obj, Object obj2) {
        this.f13549OooOo0O = i;
        this.f13550OooOo0o = obj;
        this.f13548OooOo = obj2;
    }

    @Override // o000Oo00.OooOOO0
    public void OooO00o(o000Oo00.OooOOO oooOOO) {
        ((o000Oo00.OooOOO0) this.f13550OooOo0o).OooO00o(oooOOO);
        ((o000Oo00.OooOOO0) this.f13548OooOo).OooO00o(oooOOO);
    }

    @Override // o0000oo0.o00oO0o
    public Object OooO0OO(o000O0Oo.OooO0o oooO0o) {
        String strValueOf;
        switch (this.f13549OooOo0O) {
            case 9:
                Context context = (Context) oooO0o.get(Context.class);
                switch (((o0000O.OooOo00) this.f13548OooOo).f29343OooOo0O) {
                    case 5:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo == null) {
                            strValueOf = "";
                            break;
                        } else {
                            strValueOf = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                    case 6:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 == null) {
                            strValueOf = "";
                            break;
                        } else {
                            strValueOf = String.valueOf(applicationInfo2.minSdkVersion);
                            break;
                        }
                    case 7:
                        int i = Build.VERSION.SDK_INT;
                        if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                    if (i >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                        strValueOf = "embedded";
                                        break;
                                    } else {
                                        strValueOf = "";
                                        break;
                                    }
                                } else {
                                    strValueOf = "auto";
                                    break;
                                }
                            } else {
                                strValueOf = "watch";
                                break;
                            }
                        } else {
                            strValueOf = "tv";
                            break;
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName == null) {
                            strValueOf = "";
                            break;
                        } else {
                            strValueOf = FirebaseCommonRegistrar.OooO00o(installerPackageName);
                            break;
                        }
                }
                return new o000Ooo0.OooO0o((String) this.f13550OooOo0o, strValueOf);
            default:
                String str = (String) this.f13550OooOo0o;
                o00Oo0 o00oo0 = (o00Oo0) this.f13548OooOo;
                try {
                    Trace.beginSection(str);
                    return o00oo0.f29674OooO0o.OooO0OO(oooO0o);
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override // androidx.window.extensions.core.util.function.Consumer
    public void accept(Object obj) {
        EmbeddingCompat.setEmbeddingCallback$lambda$0((EmbeddingInterfaceCompat.EmbeddingCallbackInterface) this.f13550OooOo0o, (EmbeddingCompat) this.f13548OooOo, (List) obj);
    }

    @Override // OooOo.OooOOOO, androidx.arch.core.util.Function, OooOOO.OooO0o
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        OooOo oooOo = (OooOo) this.f13550OooOo0o;
        OooO00o oooO00o = oooOo.f13562OooOoO0;
        int i = oooO00o.f13541OooO0O0;
        OooOOo0.OooOo oooOo2 = (OooOOo0.OooOo) this.f13548OooOo;
        ArrayList arrayListOooO0Oo = oooOo.OooO0Oo(sQLiteDatabase, oooOo2, i);
        for (OooOOO.OooO0OO oooO0OO : OooOOO.OooO0OO.values()) {
            if (oooO0OO != oooOo2.f13488OooO0OO) {
                int size = oooO00o.f13541OooO0O0 - arrayListOooO0Oo.size();
                if (size <= 0) {
                    break;
                }
                arrayListOooO0Oo.addAll(oooOo.OooO0Oo(sQLiteDatabase, oooOo2.OooO00o(oooO0OO), size));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i2 = 0; i2 < arrayListOooO0Oo.size(); i2++) {
            sb.append(((OooO0O0) arrayListOooO0Oo.get(i2)).f13545OooO00o);
            if (i2 < arrayListOooO0Oo.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        try {
            Cursor cursor = cursorQuery;
            while (cursor.moveToNext()) {
                long j = cursor.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j), hashSet);
                }
                hashSet.add(new OooOo00(cursor.getString(1), cursor.getString(2)));
            }
            cursorQuery.close();
            ListIterator listIterator = arrayListOooO0Oo.listIterator();
            while (listIterator.hasNext()) {
                OooO0O0 oooO0O0 = (OooO0O0) listIterator.next();
                if (map.containsKey(Long.valueOf(oooO0O0.f13545OooO00o))) {
                    OooOOo0.OooOOOO oooOOOOOooO0OO = oooO0O0.f13547OooO0OO.OooO0OO();
                    long j2 = oooO0O0.f13545OooO00o;
                    for (OooOo00 oooOo00 : (Set) map.get(Long.valueOf(j2))) {
                        oooOOOOOooO0OO.OooO00o(oooOo00.f13563OooO00o, oooOo00.f13564OooO0O0);
                    }
                    listIterator.set(new OooO0O0(j2, oooO0O0.f13546OooO0O0, oooOOOOOooO0OO.OooO0O0()));
                }
            }
            return arrayListOooO0Oo;
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return CoroutineAdapterKt.asListenableFuture$lambda$0((o000O0o) this.f13550OooOo0o, this.f13548OooOo, completer);
    }

    @Override // OooOoO0.oo0o0Oo
    public Object execute() {
        switch (this.f13549OooOo0O) {
            case 1:
                OooOo oooOo = (OooOo) ((OooOo0o.Oooo0) this.f13550OooOo0o).f13633OooO0OO;
                oooOo.getClass();
                Iterable iterable = (Iterable) this.f13548OooOo;
                if (iterable.iterator().hasNext()) {
                    oooOo.OooO00o().compileStatement("DELETE FROM events WHERE _id in " + OooOo.OooO0oo(iterable)).execute();
                    break;
                }
                break;
            default:
                OooOo0o.Oooo0 oooo0 = (OooOo0o.Oooo0) this.f13550OooOo0o;
                oooo0.getClass();
                Iterator it = ((HashMap) this.f13548OooOo).entrySet().iterator();
                while (it.hasNext()) {
                    ((OooOo) oooo0.f13630OooO).OooO0o0(((Integer) r2.getValue()).intValue(), OooOo00.OooO0OO.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
                }
                break;
        }
        return null;
    }

    @Override // com.applovin.sdk.AppLovinSdk.SdkInitializationListener
    public void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
        ((AppLovinMAX) this.f13550OooOo0o).lambda$initialize$0((MethodChannel.Result) this.f13548OooOo, appLovinSdkConfiguration);
    }

    @Override // com.unity3d.ads.IUnityAdsTokenListener
    public void onUnityAdsTokenReady(String str) {
        ((UnityAdsMediationAdapter) this.f13550OooOo0o).lambda$collectSignal$0((MaxSignalCollectionListener) this.f13548OooOo, str);
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    public void onUserEarnedReward(RewardItem rewardItem) {
        ((GoogleMediationAdapter) this.f13550OooOo0o).lambda$showRewardedAd$1((String) this.f13548OooOo, rewardItem);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        o000OOo o000ooo2 = (o000OOo) this.f13550OooOo0o;
        o000000 o000000Var = (o000000) this.f13548OooOo;
        synchronized (o000ooo2) {
            o000ooo2.f30644OooO0OO = Tasks.forResult(o000000Var);
        }
        return Tasks.forResult(o000000Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:242:0x00d3 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #10 {all -> 0x0055, blocks: (B:189:0x003e, B:191:0x0041, B:192:0x0042, B:200:0x005e, B:240:0x00cf, B:242:0x00d3, B:244:0x00d6, B:248:0x00da, B:249:0x00db, B:243:0x00d4), top: B:345:0x001a, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x00db A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #10 {all -> 0x0055, blocks: (B:189:0x003e, B:191:0x0041, B:192:0x0042, B:200:0x005e, B:240:0x00cf, B:242:0x00d3, B:244:0x00d6, B:248:0x00da, B:249:0x00db, B:243:0x00d4), top: B:345:0x001a, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x00e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0148 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r15v40, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r15v51 */
    /* JADX WARN: Type inference failed for: r15v6, types: [com.google.android.gms.tasks.Task] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r1v9, types: [o000Oooo.o0000] */
    @Override // com.google.android.gms.tasks.Continuation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object then(com.google.android.gms.tasks.Task r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OooOo.OooOO0.then(com.google.android.gms.tasks.Task):java.lang.Object");
    }
}
