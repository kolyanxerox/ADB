package o000o0oO;

import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import android.util.Log;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKey;
import com.google.android.gms.internal.ads.C2051sk;
import com.ironsource.mediationsdk.metadata.C3401a;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import o000OOO.OooOO0O;
import o000o0oo.o00Oo0;
import o000o0oo.o0OoOo0;

/* loaded from: classes2.dex */
public final class OooOo {

    /* renamed from: OooO0O0 */
    public final Context f30960OooO0O0;

    /* renamed from: OooO0Oo */
    public Map f30962OooO0Oo;

    /* renamed from: OooO0o */
    public SharedPreferences f30963OooO0o;

    /* renamed from: OooO0oO */
    public OooOO0O f30965OooO0oO;

    /* renamed from: OooO0oo */
    public C2051sk f30966OooO0oo;

    /* renamed from: OooO0OO */
    public String f30961OooO0OO = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIHNlY3VyZSBzdG9yYWdlCg";

    /* renamed from: OooO0o0 */
    public String f30964OooO0o0 = "FlutterSecureStorage";

    /* renamed from: OooO */
    public Boolean f30958OooO = Boolean.FALSE;

    /* renamed from: OooO00o */
    public final Charset f30959OooO00o = StandardCharsets.UTF_8;

    public OooOo(Context context, HashMap map) {
        this.f30962OooO0Oo = map;
        this.f30960OooO0O0 = context.getApplicationContext();
    }

    public final void OooO(String str, String str2) {
        OooO0OO();
        SharedPreferences.Editor editorEdit = this.f30963OooO0o.edit();
        if (OooO0o0()) {
            editorEdit.putString(str, str2);
        } else {
            editorEdit.putString(str, Base64.encodeToString(this.f30965OooO0oO.OooO0OO(str2.getBytes(this.f30959OooO00o)), 0));
        }
        editorEdit.apply();
    }

    public final void OooO00o(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        try {
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                Object value = entry.getValue();
                String key = entry.getKey();
                if ((value instanceof String) && key.contains(this.f30961OooO0OO)) {
                    sharedPreferences2.edit().putString(key, OooO0O0((String) value)).apply();
                    sharedPreferences.edit().remove(key).apply();
                }
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            this.f30966OooO0oo.getClass();
            editorEdit.remove("FlutterSecureSAlgorithmKey");
            editorEdit.remove("FlutterSecureSAlgorithmStorage");
            editorEdit.apply();
        } catch (Exception e) {
            Log.e("SecureStorageAndroid", "Data migration failed", e);
        }
    }

    public final String OooO0O0(String str) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (str == null) {
            return null;
        }
        byte[] bArrDecode = Base64.decode(str, 0);
        OooOO0O oooOO0O = this.f30965OooO0oO;
        int iOooO0oO = oooOO0O.OooO0oO();
        byte[] bArr = new byte[iOooO0oO];
        System.arraycopy(bArrDecode, 0, bArr, 0, iOooO0oO);
        AlgorithmParameterSpec algorithmParameterSpecOooO = oooOO0O.OooO(bArr);
        int length = bArrDecode.length - oooOO0O.OooO0oO();
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArrDecode, iOooO0oO, bArr2, 0, length);
        Key key = (Key) oooOO0O.f30248OooOo;
        Cipher cipher = (Cipher) oooOO0O.f30249OooOo0O;
        cipher.init(2, key, algorithmParameterSpecOooO);
        return new String(cipher.doFinal(bArr2), this.f30959OooO00o);
    }

    public final void OooO0OO() {
        OooO0Oo();
        String str = this.f30964OooO0o0;
        Context context = this.f30960OooO0O0;
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        if (this.f30965OooO0oO == null) {
            try {
                OooO0o(sharedPreferences);
            } catch (Exception e) {
                Log.e("SecureStorageAndroid", "StorageCipher initialization failed", e);
            }
        }
        if (!OooO0o0()) {
            this.f30963OooO0o = sharedPreferences;
            return;
        }
        try {
            SharedPreferences sharedPreferencesOooO0oO = OooO0oO(context);
            this.f30963OooO0o = sharedPreferencesOooO0oO;
            OooO00o(sharedPreferences, sharedPreferencesOooO0oO);
        } catch (Exception e2) {
            Log.e("SecureStorageAndroid", "EncryptedSharedPreferences initialization failed", e2);
            this.f30963OooO0o = sharedPreferences;
            this.f30958OooO = Boolean.TRUE;
        }
    }

    public final void OooO0Oo() {
        if (this.f30962OooO0Oo.containsKey("sharedPreferencesName") && !((String) this.f30962OooO0Oo.get("sharedPreferencesName")).isEmpty()) {
            this.f30964OooO0o0 = (String) this.f30962OooO0Oo.get("sharedPreferencesName");
        }
        if (!this.f30962OooO0Oo.containsKey("preferencesKeyPrefix") || ((String) this.f30962OooO0Oo.get("preferencesKeyPrefix")).isEmpty()) {
            return;
        }
        this.f30961OooO0OO = (String) this.f30962OooO0Oo.get("preferencesKeyPrefix");
    }

    public final void OooO0o(SharedPreferences sharedPreferences) {
        this.f30966OooO0oo = new C2051sk(sharedPreferences, this.f30962OooO0Oo);
        boolean zOooO0o0 = OooO0o0();
        Context context = this.f30960OooO0O0;
        if (zOooO0o0) {
            C2051sk c2051sk = this.f30966OooO0oo;
            this.f30965OooO0oO = ((o00Oo0) c2051sk.f24096OooOo).f30978OooOo0O.OooO0O0(context, ((o0OoOo0) c2051sk.f24098OooOo0o).f30982OooOo0O.OooO0Oo(context));
            return;
        }
        C2051sk c2051sk2 = this.f30966OooO0oo;
        o0OoOo0 o0oooo0 = (o0OoOo0) c2051sk2.f24098OooOo0o;
        o00Oo0 o00oo0 = (o00Oo0) c2051sk2.f24096OooOo;
        o0OoOo0 o0oooo02 = (o0OoOo0) c2051sk2.f24100OooOoO0;
        o00Oo0 o00oo02 = (o00Oo0) c2051sk2.f24099OooOoO;
        if (o0oooo0 == o0oooo02 && o00oo0 == o00oo02) {
            this.f30965OooO0oO = o00oo02.f30978OooOo0O.OooO0O0(context, o0oooo02.f30982OooOo0O.OooO0Oo(context));
            return;
        }
        try {
            this.f30965OooO0oO = o00oo0.f30978OooOo0O.OooO0O0(context, o0oooo0.f30982OooOo0O.OooO0Oo(context));
            HashMap map = new HashMap();
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                Object value = entry.getValue();
                String key = entry.getKey();
                if ((value instanceof String) && key.contains(this.f30961OooO0OO)) {
                    map.put(key, OooO0O0((String) value));
                }
            }
            this.f30965OooO0oO = o00oo02.f30978OooOo0O.OooO0O0(context, o0oooo02.f30982OooOo0O.OooO0Oo(context));
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            for (Map.Entry entry2 : map.entrySet()) {
                editorEdit.putString((String) entry2.getKey(), Base64.encodeToString(this.f30965OooO0oO.OooO0OO(((String) entry2.getValue()).getBytes(this.f30959OooO00o)), 0));
            }
            editorEdit.putString("FlutterSecureSAlgorithmKey", o0oooo02.name());
            editorEdit.putString("FlutterSecureSAlgorithmStorage", o00oo02.name());
            editorEdit.apply();
        } catch (Exception e) {
            Log.e("SecureStorageAndroid", "re-encryption failed", e);
            this.f30965OooO0oO = o00oo0.f30978OooOo0O.OooO0O0(context, ((o0OoOo0) c2051sk2.f24098OooOo0o).f30982OooOo0O.OooO0Oo(context));
        }
    }

    public final boolean OooO0o0() {
        return !this.f30958OooO.booleanValue() && this.f30962OooO0Oo.containsKey("encryptedSharedPreferences") && this.f30962OooO0Oo.get("encryptedSharedPreferences").equals(C3401a.f9920g);
    }

    public final SharedPreferences OooO0oO(Context context) throws GeneralSecurityException, IOException {
        return EncryptedSharedPreferences.create(context, this.f30964OooO0o0, new MasterKey.Builder(context).setKeyGenParameterSpec(new KeyGenParameterSpec.Builder(MasterKey.DEFAULT_MASTER_KEY_ALIAS, 3).setEncryptionPaddings("NoPadding").setBlockModes("GCM").setKeySize(256).build()).build(), EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
    }

    public final HashMap OooO0oo() {
        OooO0OO();
        Map<String, ?> all = this.f30963OooO0o.getAll();
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (entry.getKey().contains(this.f30961OooO0OO)) {
                String strReplaceFirst = entry.getKey().replaceFirst(this.f30961OooO0OO + '_', "");
                if (OooO0o0()) {
                    map.put(strReplaceFirst, (String) entry.getValue());
                } else {
                    map.put(strReplaceFirst, OooO0O0((String) entry.getValue()));
                }
            }
        }
        return map;
    }
}
