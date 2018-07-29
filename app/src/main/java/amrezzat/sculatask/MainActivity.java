package amrezzat.sculatask;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }




    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        FragmentManager manager=getSupportFragmentManager();
        if (id == R.id.nav_home)
        {
            Fragment home=new Home();
            manager.beginTransaction().replace(R.id.Framelayout,home).commit();

        }
        else if (id == R.id.nav_profile)
        {
            Fragment profile=new Profile();
            manager.beginTransaction().replace(R.id.Framelayout,profile).commit();
        }
        else if (id == R.id.nav_events)
        {
            Fragment events=new Events();
            manager.beginTransaction().replace(R.id.Framelayout,events).commit();

        }
        else if (id == R.id.nav_favorites)
        {
            Fragment favorites=new Favorites();
            manager.beginTransaction().replace(R.id.Framelayout,favorites).commit();
        }
        else if (id == R.id.nav_inbox)
        {
            Fragment inbox=new Inbox();
            manager.beginTransaction().replace(R.id.Framelayout,inbox).commit();
        }
        else if (id == R.id.nav_contactus)
        {
            Toast.makeText(MainActivity.this, "Redirecting you to Contacting us Information", Toast.LENGTH_SHORT).show();

        }
        else if (id == R.id.nav_feedback)
        {
            Toast.makeText(MainActivity.this, "Redirecting you to Fill a Feed back Application section", Toast.LENGTH_SHORT).show();


        }
        else if (id == R.id.nav_settings)
        {
            Toast.makeText(MainActivity.this, "Redirecting you to Settings and Configuration page", Toast.LENGTH_SHORT).show();


        }
        else if (id == R.id.nav_myschool)
        {
            Fragment myschool=new MySchool();
            manager.beginTransaction().replace(R.id.Framelayout,myschool).commit();
        }
        else if (id == R.id.nav_addschool)
        {
            Fragment addschool=new AddSchool();
            manager.beginTransaction().replace(R.id.Framelayout,addschool).commit();
        }
        else if (id == R.id.nav_guide)
        {
            Fragment guide=new UserGuide();
            manager.beginTransaction().replace(R.id.Framelayout,guide).commit();
        }
        else if (id == R.id.nav_logout)
        {
            Toast.makeText(MainActivity.this, "Logged out and Redirecting you to login page", Toast.LENGTH_LONG).show();

        }




        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
