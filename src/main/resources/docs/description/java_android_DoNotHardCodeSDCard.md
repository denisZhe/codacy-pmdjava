Since: PMD 4.2.6

Use Environment.getExternalStorageDirectory() instead of &quot;/sdcard&quot;

Example(s):
```
public class MyActivity extends Activity {
	protected void foo() {
		String storageLocation = "/sdcard/mypackage";	// hard-coded, poor approach

		storageLocation = Environment.getExternalStorageDirectory() + "/mypackage"; // preferred approach
	}
}
```

[Source](https://pmd.github.io/pmd-5.6.1/pmd-java/rules/java/android.html#DoNotHardCodeSDCard)
