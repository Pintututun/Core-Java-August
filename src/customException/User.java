package customException;

import java.util.*;

class InvalidPasswordException extends Exception {
	public InvalidPasswordException(String e) {
		// System.out.println(e);
		super(e);

	}
}

class PasswordValidator {
	public static boolean validatePassword(String pword) throws InvalidPasswordException {
		if (pword.length() >= 8) {
			boolean x = false;
			char a[] = pword.toCharArray();
			for (char ele : a) {
				if (ele >= 'A' && ele <= 'Z') {
					x = true;
					break;
				}

			}
			if (x == true) {
				boolean z = false;
				for (char ele : a) {
					if (ele >= 'a' && ele <= 'z') {
						z = true;
						break;
					}

				}
				if (z == true) {
					boolean k = false;
					for (char ele : a) {
						if (ele >= '0' && ele <= '9') {
							k = true;
							break;
						}
					}
					if (k == true) {
						boolean t = true;
						for (char ele : a) {
							if (ele == ' ') {
								t = false;
							}

						}
						if (t == true) {
							boolean m = false;
							for (char ele : a) {

								if ((ele > 32 && ele <= 47) || (ele >= 58 && ele <= 64) || (ele >= 91 && ele <= 96)
										|| (ele >= 123 && ele <= 126)) {
									m = true;
									break;
								}
							}
							if (m == true) {
								return true;
							} else {
								throw new InvalidPasswordException("Password should contain atleat one special symbol");
							}
						} else {
							throw new InvalidPasswordException("Password must not contain spaces");
						}
					} else {
						throw new InvalidPasswordException("Password must contain atleast one digit");
					}
				} else {
					throw new InvalidPasswordException("Password must contain at least one lowercase letter");
				}
			} else {
				throw new InvalidPasswordException("Password must contain atleat one uppercase");
			}
		} else {
			throw new InvalidPasswordException("Password must be atleat 8 characters long");
		}
	}

}

public class User {
	public static void main(String[] args) throws InvalidPasswordException {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String password = "";
			System.out.println("Enter the password:");

			password = sc.nextLine();

			boolean choice = PasswordValidator.validatePassword(password);
			if (choice == true) {
				System.out.println("Password is correct:");
				break;
			} else {
				System.out.println("Password is incorrect");

			}
		}

	}
}
