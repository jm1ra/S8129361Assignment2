package com.example.s8129361assignment2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class LoginFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    // Generate fragment view
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    // Runs after view is fully created
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Generate view references
        val loginButton = view.findViewById<Button>(R.id.buttonLogin)
        val usernameField = view.findViewById<EditText>(R.id.editTextUsername)
        val passwordField = view.findViewById<EditText>(R.id.editTextPassword)
        val IncorrectText = view.findViewById<TextView>(R.id.textViewIncorrect)

        loginButton.setOnClickListener {
            // Get username and password from fields
            val username = usernameField.text.toString()
            val password = passwordField.text.toString()
            // Check for the correct username and password
            if (username == "Justin" && password == "8149950") {
                // Navigate to dashboard fragment
                findNavController().navigate(R.id.action_loginFragment_to_dashboardFragment)
            } else {
                // Display incorrect username or password message
                IncorrectText.text = "Incorrect Username or Password"
                // Clear username and password fields
                usernameField.text.clear()
                passwordField.text.clear()
            }
        }
    }
}