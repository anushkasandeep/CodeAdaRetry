import android.os.Bundle;
import android.widget.FrameLayout;

public class LoginActivity {
    private static final String TAG = "AndroidClarified";
    private SignInButton googleSignInButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        googleSignInButton = findViewById(R.id.sign_in_button);
    }
}
}
