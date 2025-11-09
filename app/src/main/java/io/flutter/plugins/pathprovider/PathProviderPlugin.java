package io.flutter.plugins.pathprovider;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.ironsource.C3353m5;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugins.pathprovider.Messages;
import io.flutter.util.PathUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class PathProviderPlugin implements FlutterPlugin, Messages.PathProviderApi {
    static final String TAG = "PathProviderPlugin";
    private Context context;

    /* renamed from: io.flutter.plugins.pathprovider.PathProviderPlugin$1 */
    public static /* synthetic */ class C44781 {

        /* renamed from: $SwitchMap$io$flutter$plugins$pathprovider$Messages$StorageDirectory */
        static final /* synthetic */ int[] f13223x64ce01e6;

        static {
            int[] iArr = new int[Messages.StorageDirectory.values().length];
            f13223x64ce01e6 = iArr;
            try {
                iArr[Messages.StorageDirectory.ROOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13223x64ce01e6[Messages.StorageDirectory.MUSIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13223x64ce01e6[Messages.StorageDirectory.PODCASTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13223x64ce01e6[Messages.StorageDirectory.RINGTONES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13223x64ce01e6[Messages.StorageDirectory.ALARMS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13223x64ce01e6[Messages.StorageDirectory.NOTIFICATIONS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13223x64ce01e6[Messages.StorageDirectory.PICTURES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13223x64ce01e6[Messages.StorageDirectory.MOVIES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13223x64ce01e6[Messages.StorageDirectory.DOWNLOADS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f13223x64ce01e6[Messages.StorageDirectory.DCIM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f13223x64ce01e6[Messages.StorageDirectory.DOCUMENTS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private void setUp(BinaryMessenger binaryMessenger, Context context) {
        try {
            Messages.PathProviderApi.setUp(binaryMessenger, this);
        } catch (Exception e) {
            Log.e(TAG, "Received exception while setting up PathProviderPlugin", e);
        }
        this.context = context;
    }

    @Override // io.flutter.plugins.pathprovider.Messages.PathProviderApi
    @Nullable
    public String getApplicationCachePath() {
        return this.context.getCacheDir().getPath();
    }

    @Override // io.flutter.plugins.pathprovider.Messages.PathProviderApi
    @Nullable
    public String getApplicationDocumentsPath() {
        return PathUtils.getDataDirectory(this.context);
    }

    @Override // io.flutter.plugins.pathprovider.Messages.PathProviderApi
    @Nullable
    public String getApplicationSupportPath() {
        return PathUtils.getFilesDir(this.context);
    }

    @Override // io.flutter.plugins.pathprovider.Messages.PathProviderApi
    @NonNull
    public List<String> getExternalCachePaths() {
        ArrayList arrayList = new ArrayList();
        for (File file : this.context.getExternalCacheDirs()) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    @Override // io.flutter.plugins.pathprovider.Messages.PathProviderApi
    @Nullable
    public String getExternalStoragePath() {
        File externalFilesDir = this.context.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getAbsolutePath();
    }

    @Override // io.flutter.plugins.pathprovider.Messages.PathProviderApi
    @NonNull
    public List<String> getExternalStoragePaths(@NonNull Messages.StorageDirectory storageDirectory) {
        ArrayList arrayList = new ArrayList();
        for (File file : this.context.getExternalFilesDirs(getStorageDirectoryString(storageDirectory))) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    @VisibleForTesting
    public String getStorageDirectoryString(@NonNull Messages.StorageDirectory storageDirectory) {
        switch (C44781.f13223x64ce01e6[storageDirectory.ordinal()]) {
            case 1:
                return null;
            case 2:
                return "music";
            case 3:
                return "podcasts";
            case 4:
                return "ringtones";
            case 5:
                return "alarms";
            case 6:
                return C3353m5.f9474x;
            case 7:
                return "pictures";
            case 8:
                return "movies";
            case 9:
                return "downloads";
            case 10:
                return "dcim";
            case 11:
                return "documents";
            default:
                throw new RuntimeException("Unrecognized directory: " + storageDirectory);
        }
    }

    @Override // io.flutter.plugins.pathprovider.Messages.PathProviderApi
    @Nullable
    public String getTemporaryPath() {
        return this.context.getCacheDir().getPath();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        setUp(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Messages.PathProviderApi.setUp(flutterPluginBinding.getBinaryMessenger(), null);
    }
}
