package OoooOOO;

import Oooo00O.o000000O;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.C2051sk;

/* loaded from: classes2.dex */
public final class o0O extends oO0Oo {

    /* renamed from: OoooOO0, reason: collision with root package name */
    public static final Pair f14182OoooOO0 = new Pair("", 0L);

    /* renamed from: OooOo, reason: collision with root package name */
    public SharedPreferences f14183OooOo;

    /* renamed from: OooOoO, reason: collision with root package name */
    public o0oOo0O0 f14184OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public SharedPreferences f14185OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final o0O0o0 f14186OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public String f14187OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final o0O0oo00 f14188OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public boolean f14189OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public long f14190OooOooo;

    /* renamed from: Oooo, reason: collision with root package name */
    public final o0O0o0 f14191Oooo;

    /* renamed from: Oooo0, reason: collision with root package name */
    public final C2051sk f14192Oooo0;

    /* renamed from: Oooo000, reason: collision with root package name */
    public final o0O0o0 f14193Oooo000;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public final o0O0o00O f14194Oooo00O;

    /* renamed from: Oooo00o, reason: collision with root package name */
    public final o0O0oo00 f14195Oooo00o;

    /* renamed from: Oooo0O0, reason: collision with root package name */
    public final o0O0o00O f14196Oooo0O0;

    /* renamed from: Oooo0OO, reason: collision with root package name */
    public final o0O0o0 f14197Oooo0OO;

    /* renamed from: Oooo0o, reason: collision with root package name */
    public boolean f14198Oooo0o;

    /* renamed from: Oooo0o0, reason: collision with root package name */
    public final o0O0o0 f14199Oooo0o0;

    /* renamed from: Oooo0oO, reason: collision with root package name */
    public final o0O0o00O f14200Oooo0oO;

    /* renamed from: Oooo0oo, reason: collision with root package name */
    public final o0O0o00O f14201Oooo0oo;

    /* renamed from: OoooO, reason: collision with root package name */
    public final C2051sk f14202OoooO;

    /* renamed from: OoooO0, reason: collision with root package name */
    public final o0O0oo00 f14203OoooO0;

    /* renamed from: OoooO00, reason: collision with root package name */
    public final o0O0oo00 f14204OoooO00;

    /* renamed from: OoooO0O, reason: collision with root package name */
    public final o0O0o0 f14205OoooO0O;

    public o0O(o0OO0oO0 o0oo0oo0) {
        super(o0oo0oo0);
        this.f14193Oooo000 = new o0O0o0(this, "session_timeout", 1800000L);
        this.f14194Oooo00O = new o0O0o00O(this, "start_new_session", true);
        this.f14197Oooo0OO = new o0O0o0(this, "last_pause_time", 0L);
        this.f14199Oooo0o0 = new o0O0o0(this, "session_id", 0L);
        this.f14195Oooo00o = new o0O0oo00(this, "non_personalized_ads");
        this.f14192Oooo0 = new C2051sk(this, "last_received_uri_timestamps_by_source");
        this.f14196Oooo0O0 = new o0O0o00O(this, "allow_remote_dynamite", false);
        this.f14186OooOoOO = new o0O0o0(this, "first_open_time", 0L);
        o000000O.OooO0o0("app_install_time");
        this.f14188OooOoo0 = new o0O0oo00(this, "app_instance_id");
        this.f14200Oooo0oO = new o0O0o00O(this, "app_backgrounded", false);
        this.f14201Oooo0oo = new o0O0o00O(this, "deep_link_retrieval_complete", false);
        this.f14191Oooo = new o0O0o0(this, "deep_link_retrieval_attempts", 0L);
        this.f14204OoooO00 = new o0O0oo00(this, "firebase_feature_rollouts");
        this.f14203OoooO0 = new o0O0oo00(this, "deferred_attribution_cache");
        this.f14205OoooO0O = new o0O0o0(this, "deferred_attribution_cache_timestamp", 0L);
        this.f14202OoooO = new C2051sk(this, "default_event_parameters");
    }

    @Override // OoooOOO.oO0Oo
    public final boolean OooOO0o() {
        return true;
    }

    public final SharedPreferences OooOOOO() {
        OooOO0O();
        OooOOO0();
        o000000O.OooO0oo(this.f14183OooOo);
        return this.f14183OooOo;
    }

    public final SharedPreferences OooOOOo() {
        OooOO0O();
        OooOOO0();
        if (this.f14185OooOoO0 == null) {
            o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
            String strValueOf = String.valueOf(o0oo0oo0.f14516OooOo0O.getPackageName());
            o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            String strConcat = strValueOf.concat("_preferences");
            o0o0o0o0.f14398Oooo0.OooO0OO(strConcat, "Default prefs file");
            this.f14185OooOoO0 = o0oo0oo0.f14516OooOo0O.getSharedPreferences(strConcat, 0);
        }
        return this.f14185OooOoO0;
    }

    public final oO00000o OooOOo() {
        OooOO0O();
        return oO00000o.OooO0OO(OooOOOO().getInt("consent_source", 100), OooOOOO().getString("consent_settings", "G1"));
    }

    public final SparseArray OooOOo0() {
        Bundle bundleOooO0o0 = this.f14192Oooo0.OooO0o0();
        int[] intArray = bundleOooO0o0.getIntArray("uriSources");
        long[] longArray = bundleOooO0o0.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) this.f14574OooOo0O).f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14393OooOoOO.OooO0O0("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < intArray.length; i++) {
            sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
        }
        return sparseArray;
    }

    public final boolean OooOOoo(oO0O0O0o oo0o0o0o) {
        OooOO0O();
        String string = OooOOOO().getString("stored_tcf_param", "");
        String strOooO00o = oo0o0o0o.OooO00o();
        if (strOooO00o.equals(string)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = OooOOOO().edit();
        editorEdit.putString("stored_tcf_param", strOooO00o);
        editorEdit.apply();
        return true;
    }

    public final boolean OooOo0(long j) {
        return j - this.f14193Oooo000.OooO00o() > this.f14197Oooo0OO.OooO00o();
    }

    public final void OooOo00(boolean z) {
        OooOO0O();
        o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) this.f14574OooOo0O).f14520OooOoOO;
        o0OO0oO0.OooOOO0(o0o0o0o0);
        o0o0o0o0.f14398Oooo0.OooO0OO(Boolean.valueOf(z), "App measurement setting deferred collection");
        SharedPreferences.Editor editorEdit = OooOOOO().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z);
        editorEdit.apply();
    }
}
