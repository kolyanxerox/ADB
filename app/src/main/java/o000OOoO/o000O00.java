package o000oOoo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcelable;
import android.util.Log;
import android.webkit.MimeTypeMap;
import androidx.datastore.preferences.protobuf.OooO00o;
import com.google.android.gms.internal.measurement.o0OO0O0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.OooOo;
import o00O0oO.o000000;

/* loaded from: classes2.dex */
public final class o000O00 {
    public static void OooO(o0000OO0 o0000oo02, String str, Boolean bool, Boolean bool2, ArrayList arrayList, Integer num, o000O00O o000o00o2) {
        String str2;
        Intent intent;
        if (o0000oo02 != null) {
            if (o0000oo02.f30994OooOo0o != null) {
                int i = o0000OO0.f30990OooOooo;
                o000o00o2.error("already_active", "File picker is already active", null);
                return;
            }
            o0000oo02.f30994OooOo0o = o000o00o2;
        }
        if (o0000oo02 != null) {
            o0000oo02.f30995OooOoO = str;
        }
        if (bool != null && o0000oo02 != null) {
            o0000oo02.f30992OooOo = bool.booleanValue();
        }
        if (bool2 != null && o0000oo02 != null) {
            o0000oo02.f30996OooOoO0 = bool2.booleanValue();
        }
        if (o0000oo02 != null) {
            o0000oo02.f30999OooOoo0 = arrayList;
        }
        if (num != null && o0000oo02 != null) {
            o0000oo02.f30997OooOoOO = num.intValue();
        }
        if (o0000oo02 == null || (str2 = o0000oo02.f30995OooOoO) == null) {
            return;
        }
        if (str2.equals("dir")) {
            intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        } else if (OooOo.OooO00o(o0000oo02.f30995OooOoO, "image/*")) {
            intent = new Intent("android.intent.action.PICK");
            intent.setDataAndType(Uri.parse(Environment.getExternalStorageDirectory().getPath() + File.separator), o0000oo02.f30995OooOoO);
            intent.setType(o0000oo02.f30995OooOoO);
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", o0000oo02.f30992OooOo);
            intent.putExtra("multi-pick", o0000oo02.f30992OooOo);
            String str3 = o0000oo02.f30995OooOoO;
            if (str3 != null) {
                String str4 = o000000.Oooo0o(",", str3) ? str3 : null;
                if (str4 != null) {
                    List listOoooo0o = o000000.Ooooo0o(str4, new String[]{","});
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : listOoooo0o) {
                        if (((String) obj).length() > 0) {
                            arrayList2.add(obj);
                        }
                    }
                    o0000oo02.f30999OooOoo0 = new ArrayList(arrayList2);
                }
            }
            ArrayList arrayList3 = o0000oo02.f30999OooOoo0;
            if (arrayList3 != null) {
                intent.putExtra("android.intent.extra.MIME_TYPES", arrayList3);
            }
        } else {
            intent = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType(o0000oo02.f30995OooOoO);
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", o0000oo02.f30992OooOo);
            intent.putExtra("multi-pick", o0000oo02.f30992OooOo);
            ArrayList arrayList4 = o0000oo02.f30999OooOoo0;
            if (arrayList4 != null) {
                intent.putExtra("android.intent.extra.MIME_TYPES", (String[]) arrayList4.toArray(new String[0]));
            }
        }
        Activity activity = o0000oo02.f30993OooOo0O;
        if (intent.resolveActivity(activity.getPackageManager()) != null) {
            activity.startActivityForResult(intent, o0000OO0.f30990OooOooo);
        } else {
            Log.e("FilePickerDelegate", "Can't find a valid activity to handle the request. Make sure you've a file explorer installed.");
            o0000oo02.OooO0O0("invalid_format_type", "Can't handle the provided file type.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0124 A[Catch: IOException -> 0x011f, TryCatch #8 {IOException -> 0x011f, blocks: (B:55:0x0115, B:57:0x011b, B:61:0x0124, B:63:0x0129), top: B:91:0x0115 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0129 A[Catch: IOException -> 0x011f, TRY_LEAVE, TryCatch #8 {IOException -> 0x011f, blocks: (B:55:0x0115, B:57:0x011b, B:61:0x0124, B:63:0x0129), top: B:91:0x0115 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0115 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void OooO00o(android.app.Activity r12, android.net.Uri r13, boolean r14, java.util.ArrayList r15) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o000oOoo.o000O00.OooO00o(android.app.Activity, android.net.Uri, boolean, java.util.ArrayList):void");
    }

    public static final Uri OooO0O0(Activity activity, Uri uri, int i) {
        if (i > 0) {
            Context applicationContext = activity.getApplicationContext();
            OooOo.OooO0Oo(applicationContext, "getApplicationContext(...)");
            String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(applicationContext.getContentResolver().getType(uri));
            if (extensionFromMimeType != null && (extensionFromMimeType.contentEquals("jpg") || extensionFromMimeType.contentEquals("jpeg") || extensionFromMimeType.contentEquals("png") || extensionFromMimeType.contentEquals("webp"))) {
                Context applicationContext2 = activity.getApplicationContext();
                OooOo.OooO0Oo(applicationContext2, "getApplicationContext(...)");
                try {
                    InputStream inputStreamOpenInputStream = applicationContext2.getContentResolver().openInputStream(uri);
                    try {
                        File fileOooO0OO = OooO0OO(applicationContext2, uri);
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
                        FileOutputStream fileOutputStream = new FileOutputStream(fileOooO0OO);
                        bitmapDecodeStream.compress(OooO0Oo(applicationContext2, uri), i, fileOutputStream);
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        Uri uriFromFile = Uri.fromFile(fileOooO0OO);
                        OooOo.OooO0Oo(uriFromFile, "fromFile(...)");
                        o0OO0O0.OooOO0(inputStreamOpenInputStream, null);
                        return uriFromFile;
                    } finally {
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return uri;
    }

    public static File OooO0OO(Context context, Uri uri) throws IOException {
        File fileCreateTempFile = File.createTempFile(OooO00o.OooO0o('_', "IMAGE_", new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date())), "." + MimeTypeMap.getSingleton().getExtensionFromMimeType(context.getContentResolver().getType(uri)), context.getCacheDir());
        OooOo.OooO0Oo(fileCreateTempFile, "createTempFile(...)");
        return fileCreateTempFile;
    }

    public static Bitmap.CompressFormat OooO0Oo(Context context, Uri uri) {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(context.getContentResolver().getType(uri));
        OooOo.OooO0O0(extensionFromMimeType);
        Locale locale = Locale.getDefault();
        OooOo.OooO0Oo(locale, "getDefault(...)");
        String upperCase = extensionFromMimeType.toUpperCase(locale);
        OooOo.OooO0Oo(upperCase, "toUpperCase(...)");
        return upperCase.equals("PNG") ? Bitmap.CompressFormat.PNG : upperCase.equals("WEBP") ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG;
    }

    public static ArrayList OooO0o(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return new ArrayList(o0OO0O0.OooOO0o("*/*"));
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension((String) arrayList.get(i));
            if (mimeTypeFromExtension == null) {
                Log.w("FilePickerUtils", "Custom file type '" + ((String) arrayList.get(i)) + "' is unsupported and will not be filtered.");
                return new ArrayList(o0OO0O0.OooOO0o("*/*"));
            }
            arrayList2.add(mimeTypeFromExtension);
            if (OooOo.OooO00o(arrayList.get(i), "csv")) {
                arrayList2.add("text/csv");
            }
        }
        Log.d("FilePickerUtils", "Custom file types are " + arrayList + ". The mime types were detected as " + arrayList2 + '.');
        return arrayList2;
    }

    public static final String OooO0o0(Context context, Uri uri) {
        Exception exc;
        Uri uri2;
        String string;
        OooOo.OooO0o0(uri, "uri");
        String str = null;
        try {
            if (OooOo.OooO00o(uri.getScheme(), "content")) {
                uri2 = uri;
                Cursor cursorQuery = context.getContentResolver().query(uri2, new String[]{"_display_name"}, null, null, null);
                try {
                    Cursor cursor = cursorQuery;
                    string = (cursor == null || !cursor.moveToFirst()) ? null : cursor.getString(cursor.getColumnIndexOrThrow("_display_name"));
                    try {
                        o0OO0O0.OooOO0(cursorQuery, null);
                    } catch (Exception e) {
                        exc = e;
                        str = string;
                        Log.e("FilePickerUtils", "Failed to handle file name: " + exc);
                        return str;
                    }
                } finally {
                }
            } else {
                uri2 = uri;
                string = null;
            }
            if (string != null) {
                return string;
            }
            String path = uri2.getPath();
            if (path != null) {
                return o000000.OooooOo('/', path, path);
            }
            return null;
        } catch (Exception e2) {
            exc = e2;
        }
    }

    public static ArrayList OooO0oO(Bundle bundle) {
        return Build.VERSION.SDK_INT >= 33 ? bundle.getParcelableArrayList("selectedItems", Parcelable.class) : bundle.getParcelableArrayList("selectedItems");
    }

    public static void OooO0oo(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.listFiles() != null && file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                fileArrListFiles = new File[0];
            }
            for (File file2 : fileArrListFiles) {
                OooO0oo(file2);
            }
        }
        file.delete();
    }
}
