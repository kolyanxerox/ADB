package com.google.android.gms.auth.api.signin;

import OooOoo0.o000OOo;
import Oooo00O.o000000O;
import Oooo00o.o000O000;
import Oooo0OO.o00Ooo;
import Oooo0OO.oo000o;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.ironsource.C3007ch;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import o00Oo0oo.o00oO0o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes2.dex */
public class GoogleSignInAccount extends o000O000 implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new o000OOo(0);

    @NonNull
    @VisibleForTesting
    public static final o00Ooo zaa = oo000o.f13855OooO00o;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final int f16675OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final ArrayList f16676OooOo0o;

    @Nullable
    private final String zad;

    @Nullable
    private final String zae;

    @Nullable
    private final String zaf;

    @Nullable
    private final String zag;

    @Nullable
    private final Uri zah;

    @Nullable
    private String zai;
    private final long zaj;
    private final String zak;

    @Nullable
    private final String zal;

    @Nullable
    private final String zam;
    private final Set zan = new HashSet();

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.f16675OooOo0O = i;
        this.zad = str;
        this.zae = str2;
        this.zaf = str3;
        this.zag = str4;
        this.zah = uri;
        this.zai = str5;
        this.zaj = j;
        this.zak = str6;
        this.f16676OooOo0o = arrayList;
        this.zal = str7;
        this.zam = str8;
    }

    public static GoogleSignInAccount OooO0o0(String str) throws JSONException, NumberFormatException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String strOptString2 = jSONObject.optString(C3007ch.f7763x);
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has(NotificationCompat.CATEGORY_EMAIL) ? jSONObject.optString(NotificationCompat.CATEGORY_EMAIL) : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        o000000O.OooO0o0(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.zai = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.zak.equals(this.zak)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.f16676OooOo0o);
        hashSet.addAll(googleSignInAccount.zan);
        HashSet hashSet2 = new HashSet(this.f16676OooOo0o);
        hashSet2.addAll(this.zan);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iHashCode = this.zak.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        HashSet hashSet = new HashSet(this.f16676OooOo0o);
        hashSet.addAll(this.zan);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOoO = o00oO0o.OooOoO(parcel, 20293);
        o00oO0o.OooOooo(parcel, 1, 4);
        parcel.writeInt(this.f16675OooOo0O);
        o00oO0o.OooOo0(parcel, 2, this.zad);
        o00oO0o.OooOo0(parcel, 3, this.zae);
        o00oO0o.OooOo0(parcel, 4, this.zaf);
        o00oO0o.OooOo0(parcel, 5, this.zag);
        o00oO0o.OooOo00(parcel, 6, this.zah, i);
        o00oO0o.OooOo0(parcel, 7, this.zai);
        long j = this.zaj;
        o00oO0o.OooOooo(parcel, 8, 8);
        parcel.writeLong(j);
        o00oO0o.OooOo0(parcel, 9, this.zak);
        o00oO0o.OooOoO0(parcel, 10, this.f16676OooOo0o);
        o00oO0o.OooOo0(parcel, 11, this.zal);
        o00oO0o.OooOo0(parcel, 12, this.zam);
        o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
